/*5. Write a Java program to compare two strings lexicographically , ignoring case differences

 

*/
import java.util.Scanner;
 class Test {
    public void lexicographically(char ch1[],char ch2[] ){
        int count=0;
         if(ch1.length==ch2.length )
              count++;
          for(int i=0;i<ch1.length;i++){
             if(ch1[i]==ch2[i]){
               count++; 
             }
             else
               break;
          }
          if(count==ch1.length+1){
             System.out.println("two string are lexicographically");
          }
          else
             System.out.println("two string are not lexicographically ");  
    }
}
class TestMain{
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter first string");
     String s1=sc.nextLine();
     char ch1[]=s1.toCharArray();
     for(int i=0;i<ch1.length;i++){
          if (ch1[i] >= 65 && ch1[i] <= 90) {
                int result = (int) (ch1[i] + 32);
                ch1[i] = (char) (result);
    
         }
     }
      

     System.out.println("Enter second string  ");
     String s2=sc.nextLine();
     char ch2[]=s2.toCharArray();
     for(int i=0;i<ch2.length;i++){
          if (ch2[i] >= 65 && ch2[i] <= 90) {
                int result = (int) (ch2[i] + 32);
                ch2[i] = (char) (result);
    
         }
     }
     new Test().lexicographically(ch1,ch2);
    }
}
