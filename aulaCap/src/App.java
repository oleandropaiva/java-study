import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // int numero = 10;
        // String resultado = "";
        // if (numero > 0) {
        //     resultado = "Positivo";
        // } else if (numero < 0) {
        //     resultado = "Negativo";
        // } else {
        //     resultado = "Neutro";
        // }
        // System.out.println("Hello, word! O número é " + resultado);

        Scanner leitor = new Scanner(System.in);

        int idade = leitor.nextInt();
        float cotacaoDolar = leitor.nextFloat();
        double cotacaoEuro = leitor.nextDouble();
        String nome = leitor.nextLine();
        String codigoRua = leitor.next();

        System.out.println("Texto que será exibido no console ");
        System.out.print("Texto que será exibido no console ");
    }
}
