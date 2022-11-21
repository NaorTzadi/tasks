import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Please enter a number");
        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();

        List<Integer> primeNumbers = new ArrayList<>();
        int numberToCheck = 2;
        int count = 0;

        while (true) {
            boolean isPrime = true;
            for (int factor = 2; factor <= numberToCheck / 2; factor++) {
                if (numberToCheck % factor == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeNumbers.add(numberToCheck);
                count++;
                if (count >= limit) {
                    break;
                }
            }
            numberToCheck++;
        }
                System.out.println("The first " + limit + "prime numbers are: ");
                for (int number : primeNumbers) {
                    System.out.println(number);
                }
            }
        }