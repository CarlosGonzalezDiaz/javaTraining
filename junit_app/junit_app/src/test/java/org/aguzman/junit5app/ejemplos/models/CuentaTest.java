package org.aguzman.junit5app.ejemplos.models;

import org.aguzman.junit5app.ejemplos.excepcions.DineroInsuficienteException;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;

import java.math.BigDecimal;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;


class CuentaTest {
    Cuenta cuenta;

    @BeforeAll
    static void beforeAll(){
        System.out.println("inicializando el test");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("finalizando el test");
    }


    @BeforeEach
    void initMetodoTest(){
        Cuenta cuenta=new Cuenta("Andres", new BigDecimal("1000.12345"));
        System.out.println("iniciando el metodo");
    }

    @AfterEach
    void tearDown(){
        System.out.println("finalizando el metodo de prueba");
    }

    @Test
    @DisplayName("probando nombre de la cuenta")
    void testNombreCuenta() {
        cuenta = new Cuenta("Andres", new BigDecimal("1000.12345"));
        String esperado = "Andres";
        String real = cuenta.getPersona();
        assertEquals(esperado,real);
        assertTrue(real.equals(esperado));
    }

    @Test
    @DisplayName("consulta saldo")
    void saldoCuenta() {
        cuenta = new Cuenta("Andres", new BigDecimal("1000.12345"));
        assertEquals(1000.12345, cuenta.getSaldo().doubleValue());
        assertFalse(cuenta.getSaldo().compareTo(BigDecimal.ZERO)<0);
        assertTrue(cuenta.getSaldo().compareTo(BigDecimal.ZERO)>0);
    }

    @Test
    @DisplayName("comparar saldo")
    void referenciaDeCuenta() {
        cuenta = new Cuenta("Jhon Doe", new BigDecimal("1000.12345"));
        Cuenta cuenta2 = new Cuenta("Jhon Doe", new BigDecimal("1000.12345"));
        //assertNotEquals(cuenta2,cuenta);
        assertEquals(cuenta2,cuenta);

    }

    @Test
    @DisplayName("gastando saldo")
    void testDebitoCuenta() {
        cuenta = new Cuenta("Andres", new BigDecimal("1000.12345"));
        cuenta.debito(new BigDecimal(100));
        assertNotNull(cuenta.getSaldo());
        assertEquals(900,cuenta.getSaldo().intValue());
        assertEquals("900.12345",cuenta.getSaldo().toPlainString());

    }


    @Test
    @DisplayName("consultar saldo")
    @Disabled
    void testCreditoCuenta() {
        fail();
        cuenta = new Cuenta("Andres", new BigDecimal("1000.12345"));
        cuenta.credito(new BigDecimal(100));
        assertNotNull(cuenta.getSaldo());
        assertEquals(1100,cuenta.getSaldo().intValue());
        assertEquals("1100.12345",cuenta.getSaldo().toPlainString());

    }

    @Test
    @DisplayName("saldo insuficiente")
    void testDineroInsuficienteException() {
        cuenta = new Cuenta("Andres", new BigDecimal("1000.1235"));
        Exception exception = assertThrows(DineroInsuficienteException.class, ()->{
            cuenta.debito(new BigDecimal(1001));
        });
        String actual = exception.getMessage();
        String esperado = "Dinero Insuficiente";
        assertEquals(esperado, actual);
    }

    @Test
    @DisplayName("transferir dinero")
    void transferirDineroCuentas() {
        Cuenta cuentaDestino = new Cuenta("Jhon Doe", new BigDecimal("2500"));
        Cuenta cuentaOrigen = new Cuenta("Andres", new BigDecimal("1500.8989"));
        Banco banco = new Banco();
        banco.setNombre("Banco del Estado");
        banco.transferir(cuentaOrigen,cuentaDestino, new BigDecimal(500));
        assertEquals("1000.8989", cuentaOrigen.getSaldo().toPlainString());
        assertEquals("3000", cuentaDestino.getSaldo().toPlainString());

    }

    @Test
    @DisplayName("Relacion cuentas")
    void testRelacionBancoCuentas() {
        Cuenta cuentaDestino = new Cuenta("Jhon Doe", new BigDecimal("2500"));
        Cuenta cuentaOrigen = new Cuenta("Andres", new BigDecimal("1500.8989"));
        Banco banco = new Banco();
        banco.addCuenta(cuentaDestino);
        banco.addCuenta(cuentaOrigen);
        banco.setNombre("Banco del Estado");
        banco.transferir(cuentaOrigen,cuentaDestino, new BigDecimal(500));
        assertEquals("1000.8989", cuentaOrigen.getSaldo().toPlainString());
        assertEquals("3000", cuentaDestino.getSaldo().toPlainString());

        assertEquals(2, banco.getCuentas().size());
        assertEquals("Banco del Estado", cuentaDestino.getBanco().getNombre());
        assertEquals("Jhon Doe", banco.getCuentas().stream()
                .filter(cuenta -> cuenta.getPersona().equals("Jhon Doe")).findFirst().get().getPersona());

    }

    @Nested
    class SistemaOperativoTest{

        @Test
        @EnabledOnOs(OS.WINDOWS)
        void testSoloWindows(){

        }

        @Test
        @EnabledOnOs({OS.LINUX,OS.MAC})
        void testSoloLinuxMac(){

        }

        @Test
        @DisabledOnOs(OS.WINDOWS)
        void testNoWindows(){

        }
        @Test
        @EnabledOnJre(JRE.JAVA_8)
        void testSoloJava8(){

        }

    }


    @Test
    void imprimirSystemProperties(){
        Properties properties = System.getProperties();
        properties.forEach((k,v)-> System.out.println(k + "=" + v));
    }

    @Test
    @EnabledIfSystemProperty(named = "java.version", matches = "1.8")
    void testJavaVersion(){

    }

    @Test
    void saldoCuentaDev() {
        boolean esDev = "dev".equals(System.getProperty("ENV"));
        assumingThat(esDev, ()->{
            cuenta = new Cuenta("Andres", new BigDecimal("1000.12345"));
            assertEquals(1000.12345, cuenta.getSaldo().doubleValue());
            assertFalse(cuenta.getSaldo().compareTo(BigDecimal.ZERO)<0);
            assertTrue(cuenta.getSaldo().compareTo(BigDecimal.ZERO)>0);
        });

    }

}