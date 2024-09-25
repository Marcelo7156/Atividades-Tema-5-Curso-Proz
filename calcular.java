import java.util.Scanner;

public class calcular {
    public static void main(String[]args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite um numero: ");
            int num1 = scanner.nextInt();
            System.out.println("Digite outro numero: ");
            int num2 = scanner.nextInt();

            System.out.println("Digite \n1 para somar \n2 para subritair!");
            int opc = scanner.nextInt();

            if(opc == 1){
                int total = num1 + num2;
                System.out.println(total);
            }else{
                int total = num1 - num2;
                System.out.println(total);
            }
        }

        

    }
}
