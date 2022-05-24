package aula01ExercicioCalculadora;

public class Soma implements Calculo{
    double n1;
    double n2;
    double soma;

    public Soma() {}

    @Override
    public double calcular(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
        soma = n1 + n2;

        return soma;
    }

    @Override
    public void imprimir(){
        System.out.println("\nSOMA: " + n1 + " + " + n2 + " = " + soma);
    }

}
