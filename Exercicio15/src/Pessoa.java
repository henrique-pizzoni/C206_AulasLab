// Classe abstrata Pessoa
abstract class Pessoa {

    protected String nome;
    protected double rendaBruta;

    public Pessoa(String nome, double rendaBruta) {
        this.nome = nome;
        this.rendaBruta = rendaBruta;
    }

    public String getNome() {
        return nome;
    }

    public double getRendaBruta() {
        return rendaBruta;
    }

}