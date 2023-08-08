//Q.18 Write a Java program to add two matrices of the same size
import java.util.Scanner;
public class Arry18{
   public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter number  of row in arry1");
     int a=sc.nextInt();
     System.out.println("Enter number  of colomn in arry1");
     int b=sc.nextInt();
     int arr1[][]=new int[a][b];
     int arr2[][]=new int[a][b];
     System.out.println("Enter elements of 2D array1");
     for(int i=0;i<a;i++){
        for(int j=0;j<b;j++){
            arr1[i][j]=sc.nextInt();
     }
     }
     System.out.println("Enter elements of 2D array2");
     for(int i=0;i<a;i++){
        for(int j=0;j<b;j++){
            arr2[i][j]=sc.nextInt();
     }
     }
      System.out.println("numbers  of 2D arry1 are ...");
      for(int i=0;i<a;i++){
         for(int j=0;j<b;j++){
              System.out.print(" "+arr1[i][j]);
       }
       System.out.println();
     }
     System.out.println("numbers  of 2D arry2 are ...");
      for(int i=0;i<a;i++){
         for(int j=0;j<b;j++){
              System.out.print(" "+arr2[i][j]);
       }
       System.out.println();
     }
     System.out.println("addition  of 2D arry1 and 2D arry2 is ...");
       for(int i=0;i<a;i++){
         for(int j=0;j<b;j++){
           int sum=arr1[i][j]+arr2[i][j];
             System.out.print(" "+sum);   
       }
       System.out.println();
     }
    
       
     
     
  } 
}





