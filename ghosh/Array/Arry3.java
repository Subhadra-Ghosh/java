//3 wap to define an array of integer and assign value in program and print sum of all values
import java.util.Scanner;
public class Arry3{
   public static void main(String[]args){
   int sum=0;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter size of arry");
     int n=sc.nextInt();
     int a[]=new int[n];
     System.out.println("Enter n numbers");
     
     for(int i=0;i<n;i++){
        a[i]=sc.nextInt(); 
     }
      System.out.println("numbers are ...");
      for(int i=0;i<n;i++){
        System.out.println(a[i]);
        sum=sum+a[i];
     }
     System.out.println("sum of n array elements is : "+sum);
    
          
    }
       
     }
     
   






