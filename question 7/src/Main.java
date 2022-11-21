

public class Main {
    public static void main(String[] args) {
        int a=1000;

        for (int i=1; i<=a; i++){
            int num = i;
            int sum = 0;

            while (num > 0) {
                int remainder = num % 10;
                sum = sum + (remainder * remainder * remainder);
                num = num / 10;
            }
            if (sum==i){
                System.out.println(sum);
            }
        }
    }
}