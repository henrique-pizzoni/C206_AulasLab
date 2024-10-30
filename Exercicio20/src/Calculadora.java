public class Calculadora {
    public double dividir(double numerador, double divisor) throws DivisaoPorZeroException {
        if (divisor == 0) {
            throw new DivisaoPorZeroException("Divisão por zero não é permitida.");
        }
        return numerador / divisor;
    }
}
