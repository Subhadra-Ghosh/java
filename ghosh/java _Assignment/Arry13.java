import java.util.Scanner;
public class Arry13{
   public static void main(String[]args){
     int sum=0;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter size of arry");
     int n=sc.nextInt();
     int a[]=new int[n];
     System.out.println("Enter"+ n+" numbers");
     
     for(int i=0;i<n;i++){
        a[i]=sc.nextInt(); 
       int cube=a[i]*a[i]*a[i];
       sum=sum+cube;
     }
     
      System.out.println(" sum of cube of all elements is : "+sum); 
        
     }
     
    
          
   }
       

     
   






