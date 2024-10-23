abstract class Pessoa implements Comparable<Pessoa> {
    protected String nome;
    protected int idade;

    // Construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public int compareTo(Pessoa outraPessoa) {
        return Integer.compare(this .idade, outraPessoa.idade);
    }

}