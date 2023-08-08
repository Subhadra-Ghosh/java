
/*Write a Java program to compare two strings lexicographically Two strings are 
lexicographically equal if they are the same length and contain the same characters in the 
same positions*/
import java.util.Scanner;

public class Ass4 {
    boolean flag = true;

    public void compareString(char ch[]) {
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    flag = false;

                }

            }
        }
    }

}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String s = sc.nextLine();
        char ch = s.toCharArray();
        ;
    }
}