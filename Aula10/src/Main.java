import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Path arquivo = Paths.get("src/exemplo.txt");

        try {
            Files.writeString(arquivo, "Nome: João\nIdade: 23\nMat: 500");
        } catch (IOException e) {
            throw new RuntimeException("Erro mano");
        }


        try {
            List<String> auxiliar = Files.readAllLines(arquivo);
            System.out.println(auxiliar);
            Map<String, String> mapa = new HashMap<>();

            auxiliar.forEach((linha) -> {
               String[] quebra = linha.split(":");
               mapa.put(quebra[0],quebra[1].strip());
            });

            mapa.forEach((chave,valor)->{
                System.out.println(chave + " : " + valor);
            });

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            String salvar = Files.readString(arquivo);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
