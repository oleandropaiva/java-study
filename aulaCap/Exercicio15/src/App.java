// import java.util.Scanner;

// Faça um algoritmo que receba um número
// e diga se este número está no intervalo entre 100 e 200;

// public class App {
//     public static void main(String[] args) throws Exception {
//         int numero = 201;
//         if (numero >= 100 && numero <= 200) {
//             System.out.println(numero);
//             System.out.println("O número está no intervalo entre 100 e 200");
//         } else {
//             System.out.println(numero);
//             System.out.println("O número não está no intervalo entre 100 e 200");
//         }
//         }
//     }

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        int numero;

        Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        
        numero = leitorScanner.nextInt();

        if (numero >= 100 && numero <= 200) {
            System.out.println("O número está no intervalo entre 100 e 200");
        } else {
            System.out.println("O número não está no intervalo entre 100 e 200");
        }
    }
}