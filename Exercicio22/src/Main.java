public class Main {
    public static void main(String[] args) {
        Thread sensor1 = new Thread(new Sensor1());
        Thread sensor2 = new Thread(new Sensor2());
        Thread sensor3 = new Thread(new Sensor3());

        sensor1.start();
        sensor2.start();
        sensor3.start();
    }
}
