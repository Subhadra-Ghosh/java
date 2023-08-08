
//7) WAP to print all the prime numbers between two entered numbers
import java.util.Scanner;

public class Assig5_57{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        System.out.println("Enter the start  number ");
        int start = sc.nextInt();
        System.out.println("Enter the  end number ");
        int end = sc.nextInt();

        // System.out.println("Factorial of numbers between two entered number ");
        for (i = start; i <= end; i++) {
            int n = i;
            for (j = 1; j <= i; j++) {
                if (n % j == 0) {
                    break;

                }

            }
            if (i > n / 2)
                System.out.println("prime");
            else
                System.out.println("Not prime");

            // System.out.println("Factorial of " + i + " is " + fact);
        }

    }
}
