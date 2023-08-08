//4 wap to print max and minimum value in given array
import java.util.Scanner;
public class Arry4{
   public static void main(String[]args){
   int max=0;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter size of arry");
     int n=sc.nextInt();
     int a[]=new int[n];
     System.out.println("Enter"+ n+" numbers");
     
     for(int i=0;i<n;i++){
        a[i]=sc.nextInt(); 
     }
      System.out.println("numbers are ...");
      int min=a[0];
      
      for(int i=0;i<n;i++){
        System.out.println(a[i]);
        if(a[i]>max)
           max=a[i];
        if(a[i]<min)
           min=a[i];   
     }
     System.out.println("max number in array elements is : "+max);
     System.out.println("min number in array elements is : "+min);
     
   }
       
}
