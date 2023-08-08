
import java.util.Scanner;
public class CountOneZero{
  public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter size of array");
     int n=sc.nextInt();
     int arr[]=new int[n];
     System.out.println("enter data in   array");
     for( int i=0;i<n;i++){
        arr[i]=sc.nextInt();
     }
     int count1=0,count0=0;
     int totalsubarraycount=0;
     for(int i=0;i<n;i++){
        for(int j=i+1,index=i;j<n;j++){
            count1=0;
            count0=0;
            for(int p=index;p<=j;p++){
             if(arr[p]==1)
                count1++;
             else
                count0++;
            }
            if(count1==count0)
               totalsubarraycount++;
        }
    }
    System.out.println("total index count "+totalsubarraycount);
  } 
}

