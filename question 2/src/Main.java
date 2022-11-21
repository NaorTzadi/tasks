import java.util.Scanner;

public class Main {
        public static void printAc(float firstNub, float skips, int numberMembers) {
            for (int i = 0; i <= numberMembers; i++) {
                System.out.println(firstNub + (i ) * skips + " ");
            }
        }
        public static void main(String[] args) {
            float firstNub;
            float skips;
            int numberMembers;

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the first number: ");
            firstNub = scanner.nextFloat();
            System.out.println("Enter the number of skips: ");
            skips = scanner.nextFloat();
            System.out.println("Enter the n:");


            numberMembers = scanner.nextInt();

            while (numberMembers<=0) {
                System.out.println("not legal please Enter again");
                numberMembers=scanner.nextInt();
                while(numberMembers%1!=0) {
                    System.out.println("not legal please enter again");
                }

            }

            printAc(firstNub, skips, numberMembers) ;

        }
    }