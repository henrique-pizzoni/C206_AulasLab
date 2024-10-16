import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainAluno {
    public static void main(String[] args) {
        Aluno a1 = new Aluno(50, "JOAO");
        Aluno a2 = new Aluno(30, "TONHAO");

        List<Aluno> lista = new ArrayList<>();

        lista.add(a1);
        lista.add(a2);

        Collections.sort(lista);
        for (Aluno aux : lista)
        {
            System.out.println(aux.getNome());
        }

        System.out.println(Collections.min(lista).getNome());
    }
}
