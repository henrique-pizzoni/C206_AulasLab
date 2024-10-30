public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        // Tentativa de divisão
        try {
            double resultado = calculadora.dividir(10, 0); // Isso deve lançar a exceção
            System.out.println("Resultado: " + resultado);
        } catch (DivisaoPorZeroException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // Tentativa de divisão 2
        try {
            double resultado = calculadora.dividir(10, 5); // Isso deve lançar a exceção
            System.out.println("Resultado: " + resultado);
        } catch (DivisaoPorZeroException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
