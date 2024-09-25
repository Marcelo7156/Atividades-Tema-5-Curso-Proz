public class test {
    
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4};
            String matriz[] = new String[6];
            int cont = 0;
    
            // Percorre o array com dois loops
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    matriz[cont] = arr[i] + " vs " + arr[j];
                    System.out.println(arr[i] + " vs " + arr[j]);
                    cont++;
                }
            }
        }
    
    
}
