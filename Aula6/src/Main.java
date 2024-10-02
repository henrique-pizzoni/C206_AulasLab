import inatel.Mamifero;

public class Main {


    public static void main(String[] args) {


        Gato g1 = new Gato("Garfield", 5, 0.2);
        Cachorro c1 = new Cachorro("Totó",10,0.3);
        Mamifero gatinho = new Gato("Frajola",1,0.1);
        Mamifero cachorro = new Cachorro("Rex", 20, 0.5);

        g1.comer();

        if(cachorro instanceof Cachorro)
        {
            Cachorro aux2 = (Cachorro) cachorro;
            aux2.latir();
        }



        if(gatinho instanceof Gato)
        {
            Gato auxiliar = (Gato) gatinho;
            auxiliar.miar();
        }


        //g1.setNome("Garfield");

        //g1.comer();
        //c1.comer();

       //CRIAR GATO E CHAMA COMER





    }
}
