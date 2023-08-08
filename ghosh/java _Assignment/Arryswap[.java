import java.util.Scanner;
public class Arryswap{
   public static void main(String[]args){
     System.out.println("Enter size of array");
     Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int  a[]=new int[n];
      int b[]=new int [n];
     for(int i=0;i<n;i++){
        a[i]=sc.nextInt(); 
     }
     for(int i=0;i<n;i++){
        b[i]=sc.nextInt(); 
     }
     int temp[]=new nextInt[5];
     for( int i=0;i<n;i++){
             temp[5]=a[i];
             a[i]=b[i];
             b[i]=temp[5];
             
     }
     for(int i=0;i<=n;i++){
        Syste.out.println(" after swaping elements of array a[] is : "+a[i]);
     }
     for(int i=0;i<=n;i++){
        Syste.out.println(" after swaping elements of array b[] is : "+b[i]);
     }
            
          
        

  }



}
