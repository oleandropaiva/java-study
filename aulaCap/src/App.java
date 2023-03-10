public class App {
    public static void main(String[] args) throws Exception {
        int numero = 10;
        String resultado = "";
        if (numero > 0) {
            resultado = "Positivo";
        } else if (numero < 0) {
            resultado = "Negativo";
        } else {
            resultado = "Neutro";
        }
        System.out.println("Hello, word! O número é " + resultado);
    }
}
