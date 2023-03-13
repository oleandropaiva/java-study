// 24. Faça um algoritmo que receba “N” números e mostre 
// positivo, negativo ou zero para cada número;

public class App {

    int n = 0;
    public static void main(String[] args) throws Exception {
        
        int[] numeros = new int[5];
        numeros[0] = 1;
        numeros[1] = 0;
        numeros[2] = -1;
        numeros[3] = 2;
        numeros[4] = -2;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                System.out.println("O número " + numeros[i] + " é positivo");
            } else if (numeros[i] < 0) {
                System.out.println("O número " + numeros[i] + " é negativo");
            } else {
                System.out.println("O número " + numeros[i] + " é zero");
            }
        }
    }
}
