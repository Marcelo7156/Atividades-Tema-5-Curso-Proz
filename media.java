import java.util.Scanner;
public class media {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a 1ª nota: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite a 2ª nota: ");
        double nota2 = scanner.nextDouble();
        System.out.println("Digite 3ª nota: ");
        double nota3 = scanner.nextDouble();

        double total = (nota1 + nota2 + nota3)/3;

        System.out.println("A media das notas é: " + total);
        
    }
}
