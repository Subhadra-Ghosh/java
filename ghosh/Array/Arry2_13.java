/*
Q.13 Find the Rotation Count in Rotated Sorted array.
*/
import java.util.Scanner;
public class Arry2_13{
  public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter size of aray");
     int n=sc.nextInt();
     int a[]=new int[n];
     System.out.println("enter data in  sorted array");
     for( int i=0;i<n;i++){
        a[i]=sc.nextInt();
     }
     int indext=0;
     int min=a[0];
     for(int i=0;i<n;i++){
         if(min>a[i]){
            min=a[i];
            indext=i;
               }
         }
     System.out.println("number of rotations to be an sorted array is : "+indext);
     } 
  }

