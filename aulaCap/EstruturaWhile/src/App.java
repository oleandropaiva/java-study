import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int totalAlunos = 50;

        Scanner leitorScanner = new Scanner(System.in);
        
        while(totalAlunos > 0) {

            String nomeAluno = leitorScanner.nextLine();
            int idadeAluno = leitorScanner.nextInt();

            System.out.printLn("Nome do aluno: " + nomeAluno +
            "Idade do aluno: " + idadeAluno);

            totalAlunos = totalAlunos - 1;
        }
    }
}