import inatel.Mamifero;

public class Cachorro extends Mamifero {

    public Cachorro(String nome, int idade, double altura) {
        super(nome, idade, altura);
    }

    @Override
    public void andar() {

    }

    public void latir()
    {
        System.out.println("Auau");
    }

    @Override
    public void comer() {
        System.out.println("Cachorro está comendo");
    }
}
