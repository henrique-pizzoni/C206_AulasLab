public class Main {

    public static void main(String[] args) {

        // Criando uma Pessoa Física
        PessoaFisica pf = new PessoaFisica("Ana", 3000);

        pf.setPosses(5);

        // Criando uma Pessoa Jurídica
        PessoaJuridica pj = new PessoaJuridica("Empresa Inatel", 80000);

        pj.setLucro(700);

        // Relatório da Pessoa Física
        System.out.println("Nome: " + pf.getNome());
        System.out.println("Renda Bruta: R$ " + pf.getRendaBruta());
        System.out.println("Imposto estipulado: R$ " + pf.calcularImposto());
        System.out.println("Imposto final: R$ " + pf.impostoFinal());

        System.out.println("------------------------------");

        // Relatório da Pessoa Jurídica
        System.out.println("Nome: " + pj.getNome());
        System.out.println("Renda Bruta: R$ " + pj.getRendaBruta());
        System.out.println("Imposto a pagar: R$ " + pj.calcularImposto());
        System.out.println("Imposto final: R$ " + pj.impostoFinal());

    }
}