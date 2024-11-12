public abstract class Usuario implements Autenticavel {
    protected String nome;
    protected int idade;
    protected int matricula;


    public Usuario(String nome, int idade, int matricula) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
    }
}
