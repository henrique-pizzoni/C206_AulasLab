// Classe para Pessoa Física
class PessoaFisica extends Pessoa implements taxas {
    private int posses;

    public int getPosses() {
        return posses;
    }

    public void setPosses(int posses) {
        this.posses = posses;
    }


    public PessoaFisica(String nome, double rendaBruta) {
        super(nome, rendaBruta);
    }

    @Override
    public double calcularImposto() {
        double imposto;
        double total;
        if (rendaBruta <= 1400) {
            imposto = 0;
        }
        else if (rendaBruta <= 2100) {
            imposto = (rendaBruta * 0.10) - 100;
        }
        else if (rendaBruta <= 2800) {
            imposto = (rendaBruta * 0.15) - 270;
        }
        else if (rendaBruta <= 3600) {
            imposto = (rendaBruta * 0.25) - 500;
        }
        else {
            imposto = (rendaBruta * 0.30) - 700;
        }

        return imposto;
    }


    @Override
    public double impostoFinal() {
        if (posses >= 3)
            return calcularImposto() * 2;
        else
            return calcularImposto();
    }
}