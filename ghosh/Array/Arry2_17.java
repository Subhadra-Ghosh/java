/*
Q.17 Print All Distinct Elements of a given integer array.
*/
import java.util.Scanner;
public class Arry2_17{
  public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter size of array");
     int n=sc.nextInt();
     int a[]=new int[n];
     System.out.println("enter data in  array");
     for( int i=0;i<n;i++){
        a[i]=sc.nextInt();
     }
         int i,j;
         System.out.println("Disticnt element in array are : ");   
         for(i=0;i<n;i++){
            for( j=0;j<i+1;j++){
               if(a[i]==a[j])
                 break;
                 }
              if(i==j)
                   System.out.println(a[i]);   
         
     } 
  }
}
