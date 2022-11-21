import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter your number ");
        int n=scanner.nextInt();
        int numbersOfline=1;
        for(int i=1;i<=n;i++) {

            for (int t = numbersOfline; t <= n / 2; t++) ;
            {
                System.out.print("  ");
            }
            for (int t = 1; t <= 2 * numbersOfline - 1; t++) {
                System.out.print("    *  ");
            }
            if (i <= n / 2)
                numbersOfline++;
            else
                numbersOfline--;
            System.out.println();
        }
    }
}