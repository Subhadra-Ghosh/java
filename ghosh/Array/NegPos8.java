import java.util.Scanner;
public class NegPos8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array ");
        int n= sc.nextInt();
         int arr[]=new int[n];
         System.out.println("Enter elements of array ");
         for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();     
         }
         int count=0;
         int temp[]=new int[n];
         System.out.println("-----");
         for(int i=0;i<n;i++){
           if(arr[i]>0) {
               temp[count]=arr[i];
               count++;
               }
         }
         for(int i=0;i<n;i++){
          if(arr[i]<0) {
             temp[count]=arr[i];
             count++;
             }
         }
          for(int i=0;i<n;i++){
              System.out.println(temp[i]);
         }
   }
}
 
