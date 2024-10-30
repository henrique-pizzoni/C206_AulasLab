import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Aluno[] vetor = new Aluno[5];


        //Adicionando alunos (todos tem o mesmo nome pra facilitar)
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = new Aluno();
            vetor[i].nome = "Jo";
        }

        //Tirando um aluno do vetor, setando ele como null
        vetor[2] = null;

        //Mostrando a saída de dados, e fazendo try catch pra não ter problema e mostrar todos alunos
        for (int i = 0; i < vetor.length; i++)
        {
            try {
                System.out.println(vetor[i].nome);
            }
            catch(NullPointerException e){
                System.out.println("Erro: " + e);
            }
        }
    }
}
