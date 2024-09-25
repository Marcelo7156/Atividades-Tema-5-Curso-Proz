import java.util.Scanner;

public class retangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a altura do Retangulo");
        int altura2 = scanner.nextInt();

        System.out.println("Agora digite a largura: ");
        int largura2 = scanner.nextInt();

        int tamanhoTot = altura2*largura2;
        System.out.println("Seu retangulo tem " + tamanhoTot +" metros quadrados!");
        
    }
    
}
