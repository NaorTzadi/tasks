import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, sum=0;

        System.out.print("please enter a number");
        num = scanner.nextInt();

        while (num !=0){
            sum += num%10;
            num /= 10;
        }
        System.out.println("sum is" + sum);
    }
}