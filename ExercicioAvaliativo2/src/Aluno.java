import java.util.ArrayList;
import java.util.List;


public class Aluno extends Usuario {
    private List<Double> notas = new ArrayList<>();
    private double media = 0;

    public double getMedia() {
        return media;
    }

    public Aluno(String nome, int idade, int matricula) {
        super(nome, idade, matricula);
    }

    public void acessarSistema() {

        fazerMatricula();
    }

    private void fazerMatricula() {
        if (calcularMedia() >= 60)
            System.out.println("Sucesso! Matrícula feita");
        else {
            throw new NotaInsuficienteException("Erro na matrícula! Nota insuficiente.");
        }
    }

    public void fazerProva(double nota) {
            notas.add(nota);
    }

    public double calcularMedia() {
        double total = 0;
        for (double aux : notas) {
            total = total + aux;
        }
        media = total / notas.size();

        return media;
    }

}