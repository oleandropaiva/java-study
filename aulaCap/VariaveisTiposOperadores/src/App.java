public class App {
    public static void main(String[] args) throws Exception {
        int idade = 20;
        float cotacaoDolar = 5.20f;
        double cotacaoEuro = 6.50d;
        char genero = 'M';
        byte pontos = 127;
        boolean status = true;

        String nome = "João";
        String sobrenome = "Silva";

        System.out.println( nome + " " + sobrenome);

        System.out.println("Idade: " + idade);

        System.out.println("Cotação do Dólar: " + cotacaoDolar);

        System.out.println("Cotação do Euro: " + cotacaoEuro);

        System.out.println("Gênero: " + genero);

        System.out.println("Pontos: " + pontos);

        System.out.println("Status: " + status);

        System.out.println("Nome Completo: " + nome + " " + sobrenome);

        System.out.println("Nome Completo: " + nome.concat(" ").concat(sobrenome));

        System.out.println("Nome Completo: " + nome + " " + sobrenome);

        

    }
}
