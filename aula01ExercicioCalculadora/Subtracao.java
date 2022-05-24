package aula01ExercicioCalculadora;

public class Subtracao implements Calculo{
    double n1;
    double n2;
    double subtracao;

    public Subtracao(){}

    @Override
    public double calcular(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
        subtracao = n1 - n2;

        return subtracao;
    }

    @Override
    public void imprimir() {
        System.out.println("\nSUBTRAÇÃO: " + n1 + " - " + n2 + " = " + subtracao);
    }
}
