public class Main {
    public static void main(String[] args) {

        Veiculo v1 = new Veiculo("Barco",1990);
        v1.mostraInfo();

        Veiculo b1 = new Bicicleta("Shimano", 2010);

        if (b1 instanceof Bicicleta) {
            Bicicleta b2 = (Bicicleta) b1;
            b2.setTemGarupa(true);
            b2.darGrau();

            b2.mostraInfo();
        }

        Veiculo c1 = new Carro("Ford", 2002);

        if (c1 instanceof Carro)
        {
            Carro c2 = (Carro) c1;
            c2.setnPortas(2);
            c2.apostarCorrida();

            c2.mostraInfo();
        }


    }
}
