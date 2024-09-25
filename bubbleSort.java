//import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int numeros[] = {1,2,5,4,8,3,6,7};
        int troca = 0;

        for(int i = 0; i < numeros.length; i++){
            for(int j = 0; j < numeros.length; j++){
                if(numeros[i] < numeros[j]){
                    troca = numeros[j];
                    numeros[j] = numeros[i];
                    numeros[i] = troca;
                }
            }
        }
        for(int h = 0; h < numeros.length; h++){
            System.out.print(numeros[h] + " ");
        }
    }
}
