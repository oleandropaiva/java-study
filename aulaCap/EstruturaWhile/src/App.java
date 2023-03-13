import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int totalAlunos = 10;

        Scanner leitorScanner = new Scanner(System.in);
        
        while(totalAlunos > 0) {

            String nomeAluno = leitorScanner.nextLine();
            int idadeAluno = leitorScanner.nextInt();

            System.out.println("Nome do aluno: " + nomeAluno + 
            " Idade do aluno: " + idadeAluno);

            totalAlunos = totalAlunos - 1;
        }
    }
}