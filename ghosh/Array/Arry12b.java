/*Q.12 a) Write a statement that declares a string array initialized with the following strings:
"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" and "Saturday".
b) Write a loop that displays the contents of each element in the array that you declared.*/
import java.util.Scanner;
public class Arry12b{
   public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
       //String a[]=new String[7];
       System.out.println("a String Array initilizationo with week days name ");
        String a[]={"Sunday","Monday","TUesday","Wednesday","Tharsday","Friday","Saturday"};
      for(int i=0;i<7;i++){
          System.out.println("Week days name is : "+a[i]);
      
      }
     
    
          
  }
}
     
   


