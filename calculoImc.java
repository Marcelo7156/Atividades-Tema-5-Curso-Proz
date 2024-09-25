import java.util.Scanner;

public class calculoImc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a sua altura: ");
        double altura = scanner.nextDouble();
        System.out.println("Agora digite o seu peso: ");
        double peso = scanner.nextDouble();

        double imc = altura * altura / peso;

        
    }
}
