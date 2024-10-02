public class Bicicleta extends Veiculo{
    private boolean temGarupa;

    public boolean isTemGarupa() {
        return temGarupa;
    }

    public void setTemGarupa(boolean temGarupa) {
        this.temGarupa = temGarupa;
    }



    public Bicicleta(String marca, int ano) {
        super(marca, ano);
        this.temGarupa = temGarupa;
    }

    public void darGrau()
    {
        System.out.println("Dando grau");
    }

    public void mostraInfo()
    {
        super.mostraInfo();
        System.out.println("Essa bike tem garupa? " + temGarupa);
    }

}
