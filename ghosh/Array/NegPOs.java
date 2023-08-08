import java.util.Scanner;
public class NegPOs{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array ");
        int n= sc.nextInt();
         int arr[]=new int[n];
         for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();     
         }
         int countNeg=0,countPos=0;
         for(int i=0;i<n;i++){
           if(arr[i]<0) 
               countNeg++;
           if(arr[i]>0) 
               countPos++;      
         }
         for(int i=0;i<n;i++){
          if(arr[i]<0) {
             arr[arr.length-countNeg]=arr[i];
             countNeg--;
             }
          /* if(arr[i]>0) 
               countPos++;  */    
         }
         for(int i=0;i<n;i++){        
            System.out.println(arr[i]);
             } 
   }
}
 
