import java.util.Scanner;
public class LesserAndGreater_22{
   public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter size of aray");
     int n=sc.nextInt();
     int arr[]=new int[n];
     System.out.println("enter data in array");
     for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
     }
      System.out.println("enter number to find nerest and greater ");
     int k=sc.nextInt();
     for(int i=1;i<n-1;i++){
       if(arr[i]==k){
          if( (arr[i]>arr[i-1])  &&  (arr[i] < arr[i+1])){
            System.out.println(" Nearest Lesser  element in array is  : "+arr[i-1]);
            System.out.println(" Nearest Lesser  element in array is  : "+arr[i+1]);
           }
      }
     }
   }
}
