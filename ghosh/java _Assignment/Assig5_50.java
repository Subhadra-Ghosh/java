import java.util.Scanner;

public class Assig5_50{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start number ");
        int start = sc.nextInt();
        System.out.println("Enter the Last  number ");
        int end = sc.nextInt();
        int rem, n, rev;

        int i, p;
        for (i = start, n = 0; i <= end; i++) {
            n = i;
            // p = n;
            rev = 0;
            while (i != 0) {
                rem = i % 10;
                rev = rev * 10 + rem;
                i = i / 10;

            }
            // System.out.println(rev);

            if (rev == n) {
                System.out.println(n + "  is pallindrom");
            }
        }

    }
}
