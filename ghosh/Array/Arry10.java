/*10.Take 20 integer inputs from user and print the following:
 number of positive numbers
 number of negative numbers
 number of odd numbers
 number of even numbers
 number of 0s.*/
import java.util.Scanner;
public class Arry10{
   public static void main(String[]args){
     int posi=0,net=0,odd=0,even=0,zero=0;
     Scanner sc=new Scanner(System.in);
     
     int a[]=new int[20];
     System.out.println("Enter 20 numbers");
     
     for(int i=0;i<20;i++){
        a[i]=sc.nextInt(); 
     }
     
      for(int i=0;i<20;i++){
        if(a[i]>0)
           posi++;
        if(a[i]<0)
           net++; 
        if(a[i]%2==0)
           even++;
        if(a[i]%2!=0)
           odd++;
        if(a[i]==0)
           zero++;
     }
     System.out.println("number of positive number in arry is : "+posi);
     System.out.println("number of negative number in arry is : "+net);
     System.out.println("number of even number in arry is : "+even);  
     System.out.println("number of odd number in arry is : "+odd);   
     System.out.println("number of 0's in arry is : "+zero);
    }
       
     }
     
   






