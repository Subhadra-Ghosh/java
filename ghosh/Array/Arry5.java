//5 wap to find and print even numbers in given array
import java.util.Scanner;
public class Arry5{
   public static void main(String[]args){
  
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter size of arry");
     int n=sc.nextInt();
     int a[]=new int[n];
     System.out.println("Enter"+ n+" numbers");
     
     for(int i=0;i<n;i++){
        a[i]=sc.nextInt(); 
     }
     
      for(int i=0;i<n;i++){
        if(a[i]%2==0)
           System.out.println("Even number  in array is  : "+a[i]);
        
     }
     
    
          
    }
       
     }
     
   






