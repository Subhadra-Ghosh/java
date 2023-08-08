/*Q.10.
Write a program to cyclically rotate array by one.*/
import java.util.Scanner;
 class Array{
   public void rotedbyone(int arr[],int k){    
     for(int i=0;i<arr.length;i++){
        if(i<k)
          System.out.print(" "+arr[arr.length+i-k]);
        else
           System.out.print(" "+arr[i-k]);
     }   
   }
}
 public class TestMain_Array10{
  public static void main(String [] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the roted number");
     int k=sc.nextInt();
     Array obj=new Array();
     obj.rotedbyone(new int[]{2,6,6,2,8,10},k);
     System.out.println();
  }
}
