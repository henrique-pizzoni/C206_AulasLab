public class Carro extends Veiculo{
    private int nPortas;

    public void setnPortas(int nPortas) {
        this.nPortas = nPortas;
    }

    public Carro(String marca, int ano) {
        super(marca, ano);
    }

    public void apostarCorrida()
    {
        System.out.println("vRUMMM");
    }


    public void mostraInfo()
    {
        super.mostraInfo();
        System.out.println("N de portas do carro: " + nPortas);
    }

}
