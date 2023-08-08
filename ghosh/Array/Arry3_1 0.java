/*
Q.10 create a class Toy having variable toyname ,price,and static variable "madein" .
create no arg and parameterized constructor to initialize class variables .
Define static function static display and non static method display
--display() print class non static variable
--static display print static variable
create another class Electronic Toy which h
*/
import java.util.Scanner;
public class Toy{
   String toyname;
   
  public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter size of array");
     int n=sc.nextInt();
     int arr[]=new int[n];
     System.out.println("enter data in  array 😱️");
     for( int i=0;i<n;i++){
        arr[i]=sc.nextInt();
     }   
         boolean test=true;
         int i,j;
         System.out.println("Enter sum of any elements in array: ");   
         int sum=sc.nextInt();
         for(i=0;i<arr.length;i++){
            for( j=i+1,int currentSum=arr[i];j<arr.length ;j++){
                   currentSum=currentSum+arr[j];
                 }
            if(currentSum==sum){
               System.out.println("Sum of elements between indices "+i+" and"+j+" is :");   
               test=false;
               break;
               }
              }
          if(test==true) 
              System.out.println("No subarray found to that sum ");   
  }
}
