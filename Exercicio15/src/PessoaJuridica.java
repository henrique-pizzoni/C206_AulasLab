// Classe para Pessoa Jurídica
class PessoaJuridica extends Pessoa implements taxas {
    private double lucro;

    public double getLucro() {
        return lucro;
    }

    public void setLucro(double lucro) {
        this.lucro = lucro;
    }

    public PessoaJuridica(String nome, double rendaBruta) {
        super(nome, rendaBruta);
    }

    @Override
    public double calcularImposto() {
        return rendaBruta * 0.10;
    }



    @Override
    public double impostoFinal() {
        if (lucro >= 50000) {
            return calcularImposto()*5;
        }
        else
            return calcularImposto();
    }
}
