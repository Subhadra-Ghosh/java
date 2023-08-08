/*16. Write a Java program to replace a specified character with another character

 */
import java.util.Scanner;
 class Test {
    public void replace(char ch[],char c1,char c2) { 
        
        for (int i = 0; i < ch.length; i++) {
            if(ch[i]==c1)
                ch[i]=c2;
            else if(ch[i]==c2)
                ch[i]=c1;    
        }
        System.out.println("after  replacing string is :");
        for(int i=0;i<ch.length;i++){
            System.out.print(ch[i]);
        }    
    }             
 }

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String s = sc.nextLine();
        System.out.println("Enter first character to replace ");
        char c1 = sc.next().charAt(0);
        System.out.println("Enter second character to replace ");
        char c2 = sc.next().charAt(0);
        char ch[]=s.toCharArray();
         new Test().replace(ch,c1,c2);
        
        

    }
}
