import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List lista = new ArrayList();

        lista.add(1);
        lista.add("INATEL");
        lista.add(3.5f);

        //Sobrecarga de add
        //lista.add(1, 3);

        System.out.println(lista.get(1));

        int x = (int)lista.get(0);
        System.out.println(x);

        List<String> listaEspecifica = new ArrayList<>();

        listaEspecifica.add("oi");
        listaEspecifica.add("tchau");
        listaEspecifica.add("Amora");
        String resposta = listaEspecifica.get(0);
        //System.out.println(resposta);

        for (int i = 0; i < listaEspecifica.size(); i++){
            System.out.println(listaEspecifica.get(i));
        }

        for (String resp:listaEspecifica)
        {
            System.out.println(resp);
        }


        List<Aluno> alunos = new ArrayList();

        alunos.add(new Aluno(30, "Marcos"));

        Collections.sort(listaEspecifica);



        for (String resp:listaEspecifica)
        {
            System.out.println(resp);
        }

    }
}

