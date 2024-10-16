import java.util.*;

public class MainHash {
    public static void main(String[] args) {
        Map<String, Double> mapa = new HashMap<>();

        mapa.put("Tony", 50.3);
        mapa.put("Jose", 30.0);
        mapa.put("Mateus", 0.0);

        System.out.println(mapa.get("Tony"));
        System.out.println(mapa.get("Mateus"));

        mapa.put("Mateus", 35.0);
        System.out.println(mapa.get("Mateus"));

        mapa.forEach((chave,valor)->{
            System.out.println("Aluno: " + chave);
            System.out.println("Nota: " + valor);
        }
        );


        System.out.println(mapa.containsKey("Mateus"));

    }


}
