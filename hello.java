import java.util.Scanner;

public class hello {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Ola, " + nome +"!");
    }
}