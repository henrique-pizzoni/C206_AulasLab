import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Checked {
    public static void main(String[] args) {
        try {
            metodo();

        }
        catch (UnknownHostException e)
        {
            System.out.println("Erro " + e);
            System.out.println("Conexão não estabelecida!");
        }
        catch (IOException e) {
            System.out.println("Erro " + e);
            System.out.println("Conexão não estabelecida!");
        }
    }

    public static void metodo() throws IOException{
        Socket socket = new Socket("siteinexistente.com",80);
        System.out.println("Conexão estabelecida com sucesso!");
    }
}
