import java.util.Scanner;

public class atividadesJuliano {
    public static void main(String[] args) {
        System.out.println("Escolha as atividades!");
        System.out.println("*********************************");
        System.out.println("*      1 para atividade 1       *");
        System.out.println("*      2 para atividade 2       *");
        System.out.println("*      3 para atividade 3       *");
        System.out.println("*      4 para atividade 4       *");
        System.out.println("*********************************\n");

        try (Scanner ler = new Scanner(System.in)) {
            int opc = ler.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("***************************************");
                    System.out.println("1- Filtro de Números: Crie um programa \nque use 'for' para imprimir apenas \nos números ímpares de 1 a 20.  ");
                    System.out.println("***************************************");

                    for(int i = 0; i<20; i++){
                       if(i % 2 != 0){
                            System.out.print(" => " + i);
                       }
                    }
                    break;

                case 2:
                    System.out.println("******************************************");
                    System.out.println("2- Contador Incremento : Crie um programa que\n solicite que o usuário digite diversos números,\n só pare de solicitar quando a soma destes números\n chegar à 100. A cada incremento, o programa\n deve avisa o valor da soma dos números.");
                    System.out.println("******************************************");

                    System.out.println("\n\nDigite um numero inteiro: ");
                    int cont = ler.nextInt(), cont2 = 2, tot = 0;
                    

                    do {
                        System.out.println("Soma = "+cont);
                        System.out.println("\nDigite o "+cont2+"º numero: ");
                        tot = ler.nextInt();
                        cont = cont + tot;
                        cont2++;

                    } while (cont <= 100);

                    System.out.println("Encerrando Programa!\n\n");
                    break;

                case 3:
                    System.out.println("***************************************");
                    System.out.println("3- Contador Regressivo: Crie um programa\n para o seguinte fluxograma:\n #Não Vou tentar colocar o Fluxograma#");
                    System.out.println("***************************************");
                    cont = 10;
                    while (cont >= 0) {
                        System.out.print(cont + " ");
                        cont--;
                    }
                    System.out.println("FINALIZANDO....\n\n");
                    break;

                case 4:
                    System.out.println("*********************************************");
                    System.out.println("4- Desenvolva um menu de opções de uma\n lanchonete usando 'do-while' e 'switch'.\n O menu deve ser exibido repetidamente até que\n o usuário escolha a opção de sair.");
                    System.out.println("*********************************************");

                    System.out.println("\n CARDAPIO ");
                    String[][] bebidas = new String[6][2];
                    String[][] comidas = new String[6][2];
                    double[] precos = new double[8];
                    bebidas[0][0] =" ";
                    bebidas[0][1] = "BEBIDAS";
                    bebidas[1][0] = "COD";
                    bebidas[1][1] = "Item";
                    bebidas[2][0] = "11";
                    bebidas[2][1] = "Refrigerantes";
                    bebidas[3][0] = "12";
                    bebidas[3][1] = "Suco Natural";
                    bebidas[4][0] = "13";
                    bebidas[4][1] = "Café";
                    bebidas[5][0] = "14";
                    bebidas[5][1] = "Chá";

                    comidas[0][0] = " ";
                    comidas[0][1] = "LANCHES";
                    comidas[1][0] = "COD";
                    comidas[1][1] = "Item";
                    comidas[2][0] = "21";
                    comidas[2][1] = "Hambúrguer";
                    comidas[3][0] = "22";
                    comidas[3][1] = "X-tudo";
                    comidas[4][0] = "23";
                    comidas[4][1] = "Hot Dog";
                    comidas[5][0] = "24";
                    comidas[5][1] = "Coxinha";

                    precos[0] = 5.00;
                    precos[1] = 7.00;
                    precos[2] = 3.50;
                    precos[3] = 3.00;
                    precos[4] = 12.00;
                    precos[5] = 18.00;
                    precos[6] = 8.00;
                    precos[7] = 4.00;
                    
                    cont = 0;
                    
                    for(int j = 0; j < bebidas.length; j++){
                        for(int k = 0; k < bebidas[j].length; k++){
                            System.out.print(bebidas[j][k] + "          " + comidas[j][k] +"     "+ precos[j]);
                            cont++;

                            if(cont % 2 == 0){
                                System.out.println(" ");
                            }
                        }
                    }

                    break;
            
                default:
                    break;
            }
        }

    }
}
