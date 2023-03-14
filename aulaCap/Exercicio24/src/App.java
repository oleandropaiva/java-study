// 24. Faça um algoritmo que receba “N” números e mostre 
// positivo, negativo ou zero para cada número;

import java.util.Scanner;

public class App {

    int n = 0;

    public static void main(String[] args) throws Exception {

        Scanner leitorScanner = new Scanner(System.in);

        char desejaContinuar = 's';

        while (desejaContinuar == 'S' || desejaContinuar == 's') {

            System.out.println("Digite um número: ");
            int numero = leitorScanner.nextInt();

            if (numero == 0) {
                System.out.println("O número é zero");
            } else {
                if (numero > 0) {
                    System.out.println("O número é maior que zero");
                } else {
                    System.out.println("O número é menor que zero");
                }
            }

            System.out.println("Deseja continuar? (S/N)");
            desejaContinuar = leitorScanner.next().charAt(0);
        }
    }
};
