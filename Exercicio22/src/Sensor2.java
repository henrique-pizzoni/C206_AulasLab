import java.util.Random;

public class Sensor2 implements Runnable {
    private Random random = new Random();

    @Override
    public void run() {
        while (true) {
            int temperatura = random.nextInt(11) + 30; // Gera um número entre 30 e 40
            System.out.println("Sensor 2 - Temperatura: " + temperatura + "°C");
            if (temperatura == 40) {
                System.out.println("Sensor 2 detectou 40°C e está encerrando a thread.");
                break;
            }
            try {
                Thread.sleep(3000); // Pausa de 3 segundos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
