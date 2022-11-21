import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum=0, n1=0, n2=1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int number = scanner.nextInt();
        for (int i=2; i<=number; i++){
            sum=n1+n2;
            n1=n2;
            n2=sum;
            if (number==sum)
                System.out.println("fibonacci");
        }
    }
}