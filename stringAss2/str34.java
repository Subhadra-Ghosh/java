/*34. Write a Java program to check if the letter 'x' is present in the word 'String Exercises'
 */
import java.util.Scanner;
 class Test {
     public boolean check(char ch[],char x){
        boolean flag=true;
       for(int i=0;i<ch.length;i++){
         if(ch[i]==x){
            flag=false;
         }
       }
       if(flag==false)
          return true;
       else
          return false;   
    }  
}                 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = "String Exercise";
        char ch[]=s1.toCharArray();
        boolean s= new Test().check(ch,'x');
        System.out.println(s);
        }
}
