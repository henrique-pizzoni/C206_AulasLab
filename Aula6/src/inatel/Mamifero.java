package inatel;

public abstract class Mamifero {
    protected String nome;
    protected int idade;
    protected double altura;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public Mamifero(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public Mamifero(int idade, double altura)
    {
        this.idade = idade;
        this.altura = altura;
    }

    //PROTECTED

    public abstract void andar();


    //FUNÇÃO COMER
    public void comer()
    {
        System.out.println(nome + " está comendo");
    }


}
