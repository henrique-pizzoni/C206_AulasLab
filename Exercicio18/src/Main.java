import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,String> mapa = new HashMap<>();
        Carro car1 = new Carro();
        Carro car2 = new Carro();
        Carro car3 = new Carro();

        car1.setPlaca("12F309");
        car1.setModelo("Uninho");

        car2.setPlaca("3FGHIU");
        car2.setModelo("Fiesta");

        car3.setPlaca("DJA904");
        car3.setModelo("Corsa");

        mapa.put(car1.getPlaca(), car1.getModelo());
        mapa.put(car2.getPlaca(), car2.getModelo());
        mapa.put(car3.getPlaca(), car3.getModelo());

        mapa.forEach((chave,valor)->
                {
                    System.out.println("Placa do carro: " + chave);
                    System.out.println("Modelo do carro: " + valor);
                }
                );

        //Verificando se a key passada existe
        System.out.println(mapa.containsKey("3FGHIU"));

        System.out.println(mapa.containsKey("BRASIL"));

    }
}
