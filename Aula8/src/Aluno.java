import javax.print.DocFlavor;

public class Aluno implements Comparable<Aluno> {
    private String nome;
    private int nota;

    public Aluno(int nota, String nome)
    {
        this.nota = nota;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int compareTo(Aluno a1){
        if (this.nota > a1.nota)
        {
            return 1;
        }
        else if (this.nota < a1.nota)
        {
            return -1;
        }
        else
            return 0;


         //OU VOCÊ PODE FAZER ASSIM
         //Integer.compare (nota, a1.nota); // ordem crescente
    }
}
