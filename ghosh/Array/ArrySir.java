

import java.util.Scanner;
public class PeakArrySir{
  public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter size of aray");
     int n=sc.nextInt();
     int a[]=new int[n];
     System.out.println("enter data in array");
     for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
     }
     System.out.println("peak elements are...");
     boolean flag=false;
     if(a[0]>a[1] )
        flag=true;    
     for(int i=1;i<n-1;i++){
     if(a[i]>a[i-1] && a[i]>a[i+1])
         flag=true;
         }
     if(a[n-1]>a[n-2])
        flag=true;
     if(flag==true)
         System.out.println("1");
     else
         System.out.println("0");
     }
      
  }




}
