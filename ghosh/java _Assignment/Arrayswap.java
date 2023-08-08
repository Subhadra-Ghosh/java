import java.util.Scanner;
public class Arrayswap{
   public static void main(String[]args){
     System.out.println("Enter size of array");
     Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int  a[]=new int[n];
      int b[]=new int [n];
     System.out.println("Enter array a[] elements");
     for(int i=0;i<n;i++){
        a[i]=sc.nextInt(); 
     }
     System.out.println("Enter array b[] elements");
     for(int i=0;i<n;i++){
        b[i]=sc.nextInt(); 
     }
     int temp[]=new int[5];
     for( int i=0;i<n;i++){
             temp[i]=a[i];
             a[i]=b[i];
             b[i]=temp[i];
     }
     for(int i=0;i<n;i++){
        System.out.println(" after swaping elements of array a[] is : "+a[i]);
     }
     for(int i=0;i<n;i++){
        System.out.println(" after swaping elements of array b[] is : "+b[i]);
     }
            
          
        

  }



}
