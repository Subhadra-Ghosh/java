
//Write a Java program to count a number of Unicode code points in the specified text 
//range of a String.
import java.util.Scanner;

public class Ass3 {
    int count = 0;

    public int codePointCount(char ch[], int firstIndex, int lastIndex) {
        for (int i = 0; i < ch.length; i++) {
            // for (int j = firstIndex; j >= lastIndex; j++) {
            if (ch[i] == ch[i])
                count++;
            // }
        }
        return count;
    }

}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String s = sc.nextLine();
        char ch[] = s.toCharArray();
        System.out.println("Enter the first Index");
        int firstIndex = sc.nextInt();
        System.out.println("Enter the second Index");
        int SecondIndex = sc.nextInt();
        Ass3 obj = new Ass3();
        System.out.println(obj.codePointCount(null, firstIndex, firstIndex));
    }
}