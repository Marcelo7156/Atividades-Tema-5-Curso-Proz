import java.util.Scanner;

public class temperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatura: ");
        double celcios = scanner.nextDouble();
        
        double conversao = celcios * 1.8 + 32;

        System.out.println(celcios + " graus celcius ficam "+conversao+" em fahrenheit.");

    }
}
