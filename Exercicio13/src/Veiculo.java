public class Veiculo {
    protected String marca;
    protected int ano;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Veiculo(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }

    public void mostraInfo()
    {
        System.out.println("Veículo da marca: " + marca + " e ano " + ano);
    }

}
