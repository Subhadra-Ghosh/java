import java.util.Scanner;

public class Assig5_36{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int rev = 0, rem;
        for (int i = 1; i <= n; i++) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;

        }
        System.out.println("The reverse  of number  is " + rev);

    }

}
