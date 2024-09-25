import java.util.Scanner;

public class atividades{
    public static void main(String[] args) {
        System.out.println("Escolha as atividades: ");
        System.out.println("1 para atividade 1 \n2 para atividade 2 \n3 para atividade 3 \n4 para atividade 4 \n5 para atividade 5");
        Scanner leitura = new Scanner(System.in);

        int opcao = leitura.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Declarar tipos de vareaveis e atribuir valores: ");
                int num1 = 10;
                double num2 = 10.5;
                char caracter = 'A';
                boolean logico = true;

                System.out.println("Int = "+num1 +" Double ="+ num2 +" Char = "+ caracter +" Boolean = "+ logico);
                break;

            case 2:
                System.out.println("Calcular área de retangulo: \nDigite a altura do retangulo: ");
                int altura = leitura.nextInt();

                System.out.println("Agora digite a largura: ");
                int largura = leitura.nextInt();

                System.out.println("A area do triangulo é "+altura * largura);
                break;

            case 3:
                System.out.println("PAR ou IMPAR: \n\nDigite um numero inteiro: ");
                int parImpar = leitura.nextInt();

                if(parImpar % 2 == 0){
                    System.out.println("PAR");
                }else{
                    System.out.println("IMPAR");
                }
                break;

            case 4:
                System.out.println("Pessoa A é mais velha do que pessoa B? \nDigite a idade da pessoa A: ");
                int idadeA = leitura.nextInt();
                System.out.println("Digite a idade da pessoa B: ");
                int idadeB = leitura.nextInt();

                if(idadeA > idadeB){
                    System.out.println("Verdadeiro");
                }else{
                    System.out.println("Falso");
                }
                break;

            case 5:
                System.out.println("Coloque o valor da temperatura em Celsius para converter em Fahrenheit: ");
                double temperatura = leitura.nextDouble();
                System.out.println(temperatura+"º graus Celsius é "+ temperatura * 1.8 + 32);
                
                break;
        
            default:
                break;
        }

    }
}