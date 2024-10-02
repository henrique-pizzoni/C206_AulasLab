public class Main {
    public static void main(String[] args) {


        Circulo c1 = new Circulo();
        c1.setRaio(3);
        System.out.println(c1.calcularArea());

        Esfera e1 = new Esfera();
        e1.setRaio(2);
        System.out.println(e1.calcularArea());

        Retangulo r1 = new Retangulo();
        r1.setComprimento(3);
        r1.setLargura(20);
        System.out.println(r1.calcularArea());

    }
}
