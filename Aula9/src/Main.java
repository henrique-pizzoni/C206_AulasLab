public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando main");
        metod1();
        System.out.println("Terminando main");
    }

    public static void metod1()
    {
        System.out.println("Iniciando método 1");
        try{
            metod2();
        }
        catch(NullPointerException e)
        {
            System.out.println("Erro " + e);
        }
        System.out.println("Terminando método 1");
    }

    public static void metod2(){
        Aluno a1 = null;
        a1.nome = "Jose";
        System.out.println("Terminando método 2");
    }


}


