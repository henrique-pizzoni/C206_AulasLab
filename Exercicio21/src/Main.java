import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Path arquivo = Paths.get("src/alunos.txt");

        String conteudo = " ";

        Aluno a1 = new Aluno("Jonas", 20, 399);
        try {
            Files.writeString(arquivo, "Aluno = " + a1.nome + "\n" +
                    "Idade = " + a1.idade + "\n" +
                    "Matrícula = " + a1.matricula + "\n"
            );
            /*
            Files.writeString(arquivo, String.format("Aluno = %s\nIdade = %d\nMatricula = %d",
                    a1.nome, a1.idade, a1.matricula));
            */
        } catch (IOException e) {
            System.out.println("Erro " + e);
        }

        try {
            conteudo = Files.readString(arquivo);
        } catch (IOException e) {
            System.out.println("Erro " + e);
        }

        a1.idade = 23;
        String x = "Idade = " + a1.idade;

        atualizarAluno(arquivo, "Jonas", x);

        try {
            conteudo = Files.readString(arquivo);
        } catch (IOException e) {
            System.out.println("Erro " + e);
        }

        System.out.println(conteudo);

    }
    public static void atualizarAluno(Path arquivo, String nome, String novaInfo) {
        try {
            List<String> linhas = Files.readAllLines(arquivo);
            for (int i = 0; i < linhas.size(); i++) {
                if (linhas.get(i).contains(nome)) {
                    linhas.set(i+1, novaInfo); // Atualiza a linha com nova informação
                }
            }
            Files.write(arquivo, linhas); // Escreve todas as linhas de volta ao arquivo
        } catch (IOException e) {
            System.out.println("Erro ao atualizar o arquivo: " + e);
        }
    }
}
