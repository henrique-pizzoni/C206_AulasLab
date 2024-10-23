import java.util.*;


public class Main {
    public static void main(String[] args) {
        Pessoa engenheiro1 = new Engenheiro("Carlos", 45);
        Pessoa engenheiro2 = new Engenheiro("Ana", 30);
        Pessoa aluno1 = new Aluno("João", 20);
        Pessoa aluno2 = new Aluno("Maria", 22);

        // Criando uma lista de Pessoas e adicionando as instâncias
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(engenheiro1);
        pessoas.add(engenheiro2);
        pessoas.add(aluno1);
        pessoas.add(aluno2);


        Collections.sort(pessoas);

        // Exibindo informações após a ordenação
        System.out.println("Pessoas ordenadas por idade:");
        for (Pessoa pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.nome + " idade: " + pessoa.idade);
        }

        // Exibindo a pessoa mais nova e a mais velha
        Pessoa maisNova = Collections.min(pessoas);
        Pessoa maisVelha = Collections.max(pessoas);

        System.out.println("Pessoa mais nova: " + maisNova.nome);
        System.out.println("Pessoa mais velha: " + maisVelha.nome);
    }
}