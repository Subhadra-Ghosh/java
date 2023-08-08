/*15. Write a java program to get the length of a given string
 */
import java.util.Scanner;
 class StringLength {
    public int length(char ch[]) {
        int count=0;
        for (int i = 0; i < ch.length; i++) {
            count++; 
        }
            return count;
    }
        
        
    }



class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String s = sc.nextLine();
        char ch[]=s.toCharArray();
        int count= new StringLength().length(ch);
        System.out.println("length of string is : "+count);
        

    }
}