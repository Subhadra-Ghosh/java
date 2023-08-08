/*4. Write a Java program to compare two strings lexicographically Two strings are lexicographically equal if they are the same length and contain the same characters in the same positions

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
     System.out.println("Enter second string  ");
     String s2=sc.nextLine();
     char ch2[]=s2.toCharArray();
     new Test().lexicographically(ch1,ch2);
    }
}
