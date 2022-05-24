package aula01ExercicioCalculadora;

import javax.swing.*;
import java.util.Scanner;

public class Menu {
    int option;
    double n1;
    double n2;

    public Menu() {

    }

    public void inizializarMenu(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("====================\n");
        System.out.print("Digite um número: ");
        n1 = scanner.nextDouble();
        System.out.print("Digite um número: ");
        n2 = scanner.nextDouble();
        System.out.print("====================\n");
        System.out.print("OPERAÇÕES: ");
        System.out.print(
                """
                        \n1 - Soma\s
                        2 - Subtração\s
                        3 - Multiplicação\s
                        4 - Divisão\s
                        """);
        System.out.print("DIGITE O NÚMERO PARA SELECIONAR A OPERAÇÃO: ");

        option = scanner.nextInt();

        if (option == 1) {
            Soma soma = new Soma();
            soma.calcular(n1, n2);
            soma.imprimir();
        } else if (option ==2) {
            Subtracao subtracao = new Subtracao();
            subtracao.calcular(n1, n2);
            subtracao.imprimir();
        } else if (option == 3) {
            Multiplicacao multiplicacao = new Multiplicacao();
            multiplicacao.calcular(n1, n2);
            multiplicacao.imprimir();
        } else if (option == 4) {
            Divisao divisao = new Divisao();
            divisao.calcular(n1, n2);
            divisao.imprimir();
        } else {
            System.out.println("Entrada incorreta.");
        }

    }


}
