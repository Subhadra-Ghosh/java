/*Q.1 Write a program to make a Jagged Array .
*/
import java.util.Scanner;
public class Arry2_2{
   public static void main( String[]args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter row number of array");
      int n=sc.nextInt();
      int a[][]=new int[n][];
      //System.out.println("Enter coloumn size");
      for( int i=0;i<n;i++){
      System.out.println("Enter coloumn size");
          int col=sc.nextInt();
          a[i]=new int[col];
          }
       System.out.println("Enter data in array ");   
      for( int i=0;i<n;i++){
        for(int j=0;j<a[i].length;j++){
          a[i][j]=sc.nextInt();
         
        }
        }
       System.out.println("Jagged array is ... ") ;
      
      for( int i=0;i<n;i++){
        for(int j=0;j<a[i].length;j++){
         
         System.out.print(a[i][j]+" ");
        }
        System.out.println();
      }       
          
   }

}
