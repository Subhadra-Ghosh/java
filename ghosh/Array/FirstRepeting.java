import java.util.Scanner;
public class FirstRepeting{
  public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter size of array");
     int n=sc.nextInt();
     int arr[]=new int[n];
     System.out.println("enter data in  array");
     for( int i=0;i<n;i++){
        arr[i]=sc.nextInt();
     }
     System.out.println("first repeting element is :");
     boolean flag=false;
     for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
         if (arr[i]==arr[j]){
            flag=true;
            break;
        }
        }
        if(flag){
           System.out.println(arr[i]); 
           break;   
         }
     }
  } 
}
