public class Calculadora {

    public double dividir(double divisor, double dividendo)throws DivisorPorCeroException {
        double resultado = divisor/dividendo;
        if (dividendo==0)
        {
            throw new DivisorPorCeroException("no se puede dividor por 0");
        }
        return resultado;
    }
}
