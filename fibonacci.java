public class fibonacci {
    public static void main(String[] args) {
        int num1 = 0, num2 = 1, num3 = 0;

        for(int i = 0; i < 5; i++){
            System.out.print(num3 + " " + num1 + " " + num2 + " ");
            num3 = num1 + num2;
            num1 = num3 + num2;
            num2 = num1 + num3;
        }
        
    }
}
