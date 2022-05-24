package aula01ExercicioCalculadora;

public class Multiplicacao implements Calculo{
    double n1;
    double n2;
    double multiplicacao;

    public Multiplicacao(){}

    @Override
    public double calcular(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
        multiplicacao = n1 * n2;

        return multiplicacao;
    }

    @Override
    public void imprimir() {
        System.out.println("\nMULTIPLICAÇÃO: " + n1 + " * " + n2 + " = " + multiplicacao);
    }
}
