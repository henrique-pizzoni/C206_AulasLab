import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Professor extends Usuario {
    private Set<Aluno> lista_alunos = new HashSet<>();

    public Professor(String nome, int idade, int matricula) {
        super(nome, idade, matricula);
    }

    @Override
    public void acessarSistema() {
        mostrarAlunos();
    }

    public void addAlunoLista(Aluno a1){
        lista_alunos.add(a1);
    }

    private void mostrarAlunos()
    {
        System.out.println("Lista de alunos");
        for(Aluno aux : lista_alunos)
        {
            System.out.println("Nome do aluno: " + aux.nome);
            System.out.println("Nota do aluno: " + aux.calcularMedia());
        }
    }


}
