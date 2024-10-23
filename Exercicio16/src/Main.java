import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList();

        for (int i = 0; i < 8; i++) {
            lista.add(i);
        }

        Collections.sort(lista, Collections.reverseOrder());

        System.out.println("Lista ordenada decrescente: ");
        for (int aux : lista)
        {
            System.out.println(aux);
        }

        System.out.println("Maior valor da lista: ");
        System.out.println(Collections.max(lista));

        System.out.println("Menor valor da lista:");
        System.out.println(Collections.min(lista));
    }
}
