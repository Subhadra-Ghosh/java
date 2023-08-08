import java.util.Scanner;
public class MeargeEvenOdd_32{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter size of array1 ");
         int n1= sc.nextInt();
         int arr1[]=new int[n1];
          System.out.println("Enter size of array2 ");
         int n2= sc.nextInt();
         int arr2[]=new int[n2];
         System.out.println("Enter elements of array1 ");
         for(int i=0;i<n1;i++){
           arr1[i]=sc.nextInt();     
         }
         System.out.println("Enter elements of array2 ");
         for(int i=0;i<n2;i++){
           arr2[i]=sc.nextInt();     
         }
         int arr3[]=new int[n1+n2];
         int i,j=0,p=arr3.length-1;
         for(i=0;i<n1;i++){
              if(arr1[i]%2==0)
                 arr3[j++]=arr1[i];
              else{
                 arr3[p--]=arr1[i];
               }
         }
         for(i=0;i<n2;i++){
              if(arr2[i]%2==0)
                 arr3[j++]=arr2[i];
              else{
                 arr3[p--]=arr2[i];
               }
         }
         System.out.println("After  mearge arrays in given criteria  ");
         for(i=0,j=0;i<n1+n2;i++){
            System.out.println(arr3[i]); 
         }
        
     }
}
