import java.util.Scanner;
public class Arry2_4{
  public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter size of aray");
     int n=sc.nextInt();
     int a[]=new int[n];
     System.out.println("enter data in array");
     for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
     
     }
     
      int temp;
      temp=a[0];
      a[0]=a[n-1];
      a[n-1]=temp;
      System.out.println(" after swaping first element is : "+a[0]);
      System.out.println(" after swaping last  element is : "+a[n-1]);
  }




}
