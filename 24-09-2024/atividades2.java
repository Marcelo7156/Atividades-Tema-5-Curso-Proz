import java.util.Scanner;

public class atividades2 {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Atividades dois chatGPT: \n\nDigite entre 1 a 5 Para acessar a atividade: ");
        System.out.println("Atividade 1: Calculadora de Operações");
        System.out.println("Atividade 2: Comparação de Números");
        System.out.println("Atividade 3: Lógica de Aprovação");
        System.out.println("Atividade 4: Verificação de Maioridade");
        System.out.println("Atividade 5: Entrada em Festa");
        System.out.println("******************************************");

        int opcao = leitor.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Digite dois numeros para calcularmos ele: ");
                int num1 = leitor.nextInt();
                System.out.print("Segundo numero: ");
                int num2 = leitor.nextInt();
                System.out.println("\nAdição: "+(num1 + num2));
                System.out.println("Subtração: " + (num1 - num2));
                System.out.println("Multiplicação: "+ (num1 * num2));
                String mensagem = (num2 != 0)?"Divisão: "+(num1 / num2):"Divisão por zero não existe.";
                System.out.println(mensagem);
                mensagem = (num2 != 0)?"Resto: "+(num1 % num2):"Divisão por zero invalida!";
                System.out.println(mensagem);

                break;
        
            case 2:
                System.out.println("Digite dois numeros para compararmos: \n****************************");
                num1 = leitor.nextInt();
                System.out.println("Segundo Numero: ");
                num2 = leitor.nextInt();

                mensagem = (num1 == num2)?"Verdadeiro":"Falso";
                System.out.println("Numeros são iguais: "+mensagem);

                mensagem = (num1 > num2)?"Verdadeiro":"Falso";
                System.out.println(num1+" é maior que "+num2+"? "+mensagem);

                mensagem = (num1 < num2)?"Verdadeiro":"Falso";
                System.out.println(num1 + " é menor que "+num2+ "? "+mensagem);

                break;

            case 3:
                System.out.println("Digite duas notas: ");
                double nota1 = leitor.nextDouble();

                System.out.println("Segunda Nota: ");
                double nota2 = leitor.nextDouble();

                double total = (nota1 + nota2) /2;

                mensagem = (total >= 7)?"APROVADO":
                           (total >= 5 && total < 7)?"de RECUPERAÇÃO":"REPROVADO";
                
                System.out.println("Sua media foi de "+total+" então você está "+mensagem);


                break;

            case 4:
                System.out.println("Digite sua idade: ");

                int idade = leitor.nextInt();
                mensagem =(idade >17)?"MAIOR de IDADE":"MENOR de IDADE";

                System.out.println("Com "+idade+" você é "+mensagem);
                break;

            case 5:
                System.out.println("Digite sua idade e mostre seu ingresso: ");
                idade = leitor.nextInt();
                System.out.println("Tem ingresso: 1{Sim}, 0{Não}");
                int ingresso = leitor.nextInt();
                

                mensagem = (idade > 17 && ingresso == 1)?"Entada liberada!":"Entada Negada";
                System.out.println(mensagem);

                break;
            default:
                System.out.println("Alternativa invalida.");
                break;
        }


    }
    
}
