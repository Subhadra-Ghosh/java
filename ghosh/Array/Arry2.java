import java.util.Scanner;
public class Arry2{
   public static void main(String[]args){
     
     int  a[]=new int[5];
     System.out.println("Enter 5 numbers");
     Scanner sc=new Scanner(System.in);
     for(int i=0;i<5;i++){
        a[i]=sc.nextInt(); 
     }
      System.out.println("numbers are ---");
      for(int i=0;i<5;i++){
        System.out.println(a[i]);
     }
     System.out.println("Enter a particular number to check");
     int b=sc.nextInt();
     for( int i=0;i<5;i++){
        if(a[i]==b){
           
           System.out.println("found your number : "+b+" on the position "+i);
           break;
          
        }
        else
          System.out.println("not found number");
     }
     
   }





}
