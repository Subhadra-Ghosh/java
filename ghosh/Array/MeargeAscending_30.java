import java.util.Scanner;
public class MeargeAscending_30{
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
         int i,j;
         int arr3[]=new int[n1+n2];
         for(i=0,j=0;i<n1+n2;i++){
              if(i<n1)
                 arr3[i]=arr1[i];
              else{
                 arr3[i]=arr2[j++];
               }
         }
         System.out.println("After  mearge arrays ");
         for(i=0,j=0;i<n1+n2;i++){
            System.out.println(arr3[i]); 
         }
         int temp=0;
         System.out.println("After sorting the mearge array in Ascending order");
         for(i=0;i<n1+n2;i++){
            for( j=i+1;j<n1+n2;j++){
              if(arr3[i]>arr3[j]){
                 temp=arr3[i];
                 arr3[i]=arr3[j];
                 arr3[j]=temp;
              }
            }
            System.out.println(arr3[i]); 
         }
     }
}
