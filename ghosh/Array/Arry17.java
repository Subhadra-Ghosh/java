//Q.17 Write a Java program to find duplicate values in an array of string values.
import java.util.Scanner;
public class Arry17{
   public static void main(String[]args){
     
    
     System.out.println("Enter size of array");
     Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int  a[]=new int[n];
     for(int i=0;i<n;i++){
        a[i]=sc.nextInt(); 
     }
      System.out.println("numbers are ---");
      for(int i=0;i<n;i++){
        System.out.println(a[i]);
     }
     int dublicate=a[0];
     for( int i=0;i<n;i++){
         for(int j=i+1;j<n;j++){
             if(a[i]==a[j]){
                System.out.println("dublicate number is : "+a[i]);
              }
     
         }
     }  

  }



}
