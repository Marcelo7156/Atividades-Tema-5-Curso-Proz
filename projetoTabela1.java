import java.util.Scanner;
import java.util.Arrays;
public class projetoTabela1 {
    static Scanner escrita = new Scanner(System.in);
    /**
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Digite quantos times são: ");
        int times = escrita.nextInt();

        int[] qntTimes = new int[times];
        String[] nomesTimes = new String[qntTimes.length];
        escrita.nextLine();

        for(int i = 0; i < qntTimes.length; i++){
            System.out.println("Digite o "+ i +"º time: ");
            nomesTimes[i] = escrita.nextLine();
        }
        
        for(int j = 0; j < qntTimes.length; j++){
            System.out.println(j + " " + nomesTimes[j]);
        }
        
        String teste[][] = new String[times][times];

        System.out.println(teste);
        
        for(int k = 0; k < qntTimes.length; k++){
            for(int h = 0; h< qntTimes.length; h++){
                if(nomesTimes[k] != nomesTimes[h]){
                    teste[k][h] = nomesTimes[k] + " vs " + nomesTimes[h];
                }
            }
        }

        for(int k = 0; k < qntTimes.length; k++){
            for(int h = 1; h< qntTimes.length; h++){
                System.out.println(teste[k][h]);
            }
        }
    }
}
