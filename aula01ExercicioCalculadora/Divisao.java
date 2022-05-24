package aula01ExercicioCalculadora;

public class Divisao implements Calculo{
    double n1;
    double n2;
    double divisao;

    public Divisao(){}

    @Override
    public double calcular(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
        divisao = (n1 / n2);

        return divisao;
    }

    @Override
    public void imprimir() {
        System.out.println("\nDIVISÃO: " + n1 + " / " + n2 + " = " + divisao);
    }
}
