import java.util.Scanner;
public class Assig5_51{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start number ");
        int start = sc.nextInt();
        System.out.println("Enter the Last  number ");
        int end = sc.nextInt();
        int rem, n, rev;

        int i;
        for (i = start, n = 0; i <= end; i++) {
            n = i;
            // p = n;
            rev = 0;
            while (n != 0) {
                rem = n % 10;
                rev = rev * 10 + rem;
                n = n / 10;

            }
            System.out.println(rev);

        }

    }
}
