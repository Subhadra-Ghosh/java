import java.util.Scanner;
public class Sorting{
   public static void main(String[]args){
   int temp=0;
     System.out.println("Enter size of array");
     Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int  a[]=new int[n];
     System.out.print("Enter array a[] elements");
     for(int i=0;i<n;i++){
        a[i]=sc.nextInt(); 
     }
     System.out.println(" Elements of sorted array..." );
     for( int i=0;i<n;i++){
          for(int j=i+1;j<n;j++){
             if(a[i]<a[j]){
               temp=a[i];
               a[i]=a[j];
               a[j]=temp;
               }
               }
     System.out.println( " "+a[i]);
     }
     //System.out.println(" after sorting elements of array a[] are : ");
     //for(int i=0;i<n;i++){
        //System.out.println(a[i]);
     
  }
}
