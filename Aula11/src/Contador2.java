public class Contador2 implements Runnable {
    public void run(){
        for (int i = 0; i < 1000; i++) {
            System.out.println(i + "CONT 2");
        }
    }
}
