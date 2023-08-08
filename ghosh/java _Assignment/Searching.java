import java.util.Scanner;
public class Searching{
   public static void main(String[]args){
   int temp=0;
     System.out.println("Enter size of array");
     Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int  arr[]=new int[n];
     System.out.print("Enter array a[] elements");
     for(int i=0;i<n;i++){
        arr[i]=sc.nextInt(); 
     }
     System.out.println("enter element for search" );
     int s=sc.nextInt();
     boolean flag=false;
     for( int i=0;i<n;i++){
             if(arr[i]==s){             
               flag=true;
           }   
           }
       if(flag){
               System.out.println("number "+s+" is found");
               }
       else 
                 System.out.println("number "+s+" is not found");
               }
     
     
     }
     //System.out.println(" after sorting elements of array a[] are : ");
     //for(int i=0;i<n;i++){
        //System.out.println(a[i]);
     
  

