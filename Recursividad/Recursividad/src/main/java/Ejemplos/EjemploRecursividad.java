package Ejemplos;
import java.lang.String;
import java.util.stream.Stream;

public class EjemploRecursividad {
    public static void main(String[] args) {
        Componentes pc = new Componentes("Gabinete atx");
        Componentes poder = new Componentes("Fuente 750W");
        Componentes placa = new Componentes("BX 550");
        Componentes cpu = new Componentes("Ryzen 5 5600");
        Componentes enfriador = new Componentes("Yeyian 2 Ventiladores");
        Componentes ventiladores = new Componentes("3 Ventiladores");
        Componentes gpu = new Componentes("RTX 1050 4GB");
        Componentes tv = new Componentes("Nvidia GPU");
        Componentes gpuRam = new Componentes("4GB");
        Componentes gpuRam2 = new Componentes("4GB");
        Componentes gpuVentiladores = new Componentes("2 Ventiladores");
        Componentes ram = new Componentes("32GB");
        Componentes ssd = new Componentes("1 TB");

        cpu.addComponente(enfriador).addComponente(ventiladores);
        tv.addComponente(gpu).addComponente(gpuRam).addComponente(gpuRam2).addComponente(gpuVentiladores);
        placa.addComponente(cpu).addComponente(tv).addComponente(ram).addComponente(ssd);
        pc.addComponente(poder).addComponente(placa).addComponente(new Componentes("Teclado")).addComponente(new Componentes("Raton"));
        metodoRecursivo(pc, 0).forEach(componentes -> System.out.println());
    }

    public static Stream<Componentes> metodoRecursivo(Componentes componentes, int nivel){
        componentes.setNivel(nivel);
        return Stream.concat(Stream.of(componentes),componentes.getHijos().stream().flatMap(hijo->metodoRecursivo(hijo,nivel+1)));
    }

}

