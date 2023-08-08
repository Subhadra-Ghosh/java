import java.util.Scanner;
public class Alternate{
  public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter size of array");
     int n=sc.nextInt();
     int arr[]=new int[n];
     System.out.println("enter data in   array");
     for( int i=0;i<n;i++){
        arr[i]=sc.nextInt();
     }
     int p=0,s=1; 
     int temp[]=new int[arr.length];   
     for(int i=0;i<arr.length;i++){
       if(arr[i]>=0 && p<=n){
            temp[p]=arr[i];
            p=p+2;
            }
       else if(arr[i]<0 && s<=n){
            temp[s]=arr[i];
            s=s+2;
        }
    }
      System.out.println("New  array");
      for(int i=0;i<temp.length;i++){
          System.out.println(temp[i]);
        }
  } 
}

