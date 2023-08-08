import java.util.Scanner;
public class SubarrayLargestProduct_19{
  public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter size of array");
     int n=sc.nextInt();
     int arr[]=new int[n];
     System.out.println("enter data in  array 😎️");
     for( int i=0;i<n;i++){
        arr[i]=sc.nextInt();
     }   
         boolean test=true;
         int i,j,currentSum;
         for(i=0;i<arr.length;i++){
            for( j=i+1,currentSum=arr[i];j<arr.length;j++){
                   currentSum=currentSum*arr[j];
                   x[]
            }
         }
          if(test==false) 
              System.out.println("Yes");
           else
              System.out.println("NO");      
  }
}
