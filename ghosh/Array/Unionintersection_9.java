import java.util.Scanner;
public class Unionintersection_9{
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
         for( i=0,j=0;i<n1+n2;i++){
              if(i<n1)
                arr3[i]=arr1[i];
               else
                 arr3[i]=arr2[j];
         }
         int count=0,countintersection=0;
         boolean flag=false;
         for( i=0;i<n1+n2;i++){
              for( j=0;j<i+1;j++){
                 if(arr3[i]==arr3[j])
                    break;
              //System.out.println(arr3[i]);
         }
         if(i==j){
             count++;
         }
         }
         System.out.println("number in union array is : "+count);  
          for( i=0;i<n1;i++){
              for( j=0;j<n2;j++){
                 if(arr1[i]==arr2[j])
                    countintersection++;
           }
           }
         System.out.println("number in intersection array is : "+countintersection);  
   } 
}   
