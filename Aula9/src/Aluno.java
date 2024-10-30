public class Aluno {
    String nome;
    int matricula;
    double debito;

    public void renovarMatricula() throws DebitoException
    {
     if (debito > 0)
     {
         throw new DebitoException(" Aluno está com debito");
     }
     else
         System.out.println("Matrícula renovada!");
    }


}
