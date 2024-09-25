import java.util.Scanner;

public class divisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite um segundo: ");
        int num2 = scanner.nextInt();

        if(num2 != 0 && num2 < num1){
            double total = num1 / num2;
            System.out.println(total);
        }else{
            System.out.println("ERRO! Valores Invalidos!");
        }
    }
}
