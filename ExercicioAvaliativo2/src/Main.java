public class Main {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Jonas", 20, 344);
        Aluno a2 = new Aluno("Chris Lima", 19, 555);
        Aluno a3 = new Aluno("Manoel Gomes", 50, 1000);

        Professor p1 = new Professor("Soned", 50, 30);

        p1.addAlunoLista(a1);
        p1.addAlunoLista(a2);
        p1.addAlunoLista(a3);


        a1.fazerProva(50);
        a1.fazerProva(80);
        a1.fazerProva(100);

        a2.fazerProva(30);
        a2.fazerProva(0);
        a2.fazerProva(20);

        a3.fazerProva(2);
        a3.fazerProva(100);
        a3.fazerProva(80);

        try {
            a1.acessarSistema();
        }catch (NotaInsuficienteException e)
        {
            e.printStackTrace();
        }

        try {
            a2.acessarSistema();
        }catch(NotaInsuficienteException e)
        {
            e.printStackTrace();
            //Tambem podia fazer system out (e.getMessage());
        }

        try{
            a3.acessarSistema();
        }catch (NotaInsuficienteException e)
        {
            e.printStackTrace();
        }

        p1.acessarSistema();
    }
}
