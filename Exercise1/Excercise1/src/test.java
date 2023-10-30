public class test {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        try {
            calculadora.dividir(10,0);
        } catch (DivisorPorCeroException e) {
            throw new RuntimeException(e);
        }

    }
}
