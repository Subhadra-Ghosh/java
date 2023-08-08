/*1 wap to define an array of integer of size 6 .Take input from user and display it in reverse
order*/
import java.util.Scanner;
public class Arry1{
   public static void main(String[]args){
  
     int a[]=new int[6];
     System.out.println("Enter 5 numbers");
     Scanner sc=new Scanner(System.in);
     for(int i=0;i<6;i++){
        a[i]=sc.nextInt(); 
     }
      System.out.println("numbers are ...");
      for(int i=0;i<6;i++){
        System.out.println(a[i]);
     }
     System.out.println("in reverse order numbers are...");
     for( int i=5;i>=0;i--){
      
          System.out.println(a[i]);
          
        }
       
     }
     
   }






