import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");

        int valor = scanner.nextInt();

        System.out.println("Segue a tabuada de " + valor);

        for(int i=0; i < 10; i++){
            int total = valor * i;
            System.out.println(valor + " * "+ i + " = "+ total);
        }

    }
}
