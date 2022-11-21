import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);
        System.out.println("Enter a: ");
        double a= in.nextDouble();
        System.out.println("Enter  b");
        double b=in.nextDouble();
        System.out.println("Enter c");
        double c=in.nextDouble();
        double dis= Math.pow(b,2)-4*a*c;
        if (dis>=0) {
            if (dis > 0) {
                double x1 = (-b + Math.sqrt(dis)) / (2 * a);
                double x2 = (-b - Math.sqrt(dis)) / (2 * a);
                System.out.println("there are two results for the equation:");
                System.out.println("x1=" + x1);
                System.out.println("x2=" + x2);
            } else {

                double x1 = (-b + dis) / (2 * a);
                System.out.println("there is one result for the equation: ");
                System.out.println("x1=" + x1);
            }
        }
        else
            System.out.println("there are no results for the equation ");
    }
}

