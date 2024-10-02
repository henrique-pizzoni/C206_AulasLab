import inatel.Mamifero;

public class Gato extends Mamifero {
    public Gato(String nome, int idade, double altura) {
        super(nome, idade, altura);
    }

    @Override
    public void andar() {
        System.out.println("Gatinho está andando");

    }

    public void miar()
    {
        System.out.println("Gato miando ");
    }

    public void comer()
    {
        super.comer();
        System.out.println("Gatinho está comendo");
    }


}
