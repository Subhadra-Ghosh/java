//8.Write a program to find the sum and product of all elements of an array
import java.util.Scanner;
public class Arry8{
   public static void main(String[]args){
   int sum=0,product=1;
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
        product=product*a[i];
     }
     System.out.println("sum of "+n+" array elements is : "+sum);
     System.out.println("product of "+ n+" array elements is : "+product);
    
          
    }
       
     }
     
   






