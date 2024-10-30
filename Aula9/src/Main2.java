public class Main2 {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();

       // a1 = null;


        try {
            a1.nome = "Marquinhos";
        }
        catch (NullPointerException e)
        {
            System.out.println("Erro " + e);
        }


        System.out.println("oi");
        try
        {
            matricularAluno(a1);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Erro " + e);
        }
        finally
        {
            System.out.println("ufa");
        }

        a1.debito = 30;
        try {
            a1.renovarMatricula();
        }
        catch(DebitoException e)
        {
            e.printStackTrace();
        }
    }

    public static void matricularAluno(Aluno a1)
    {

        a1.matricula = -5;
        if (a1.matricula > 0)
        {
            System.out.println("Aluno matriculado!");
        }
        else
            throw new IllegalArgumentException();
    }
}
