import java.util.Scanner;
public class LongestSequence_21{
   public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter size of aray");
     int n=sc.nextInt();
     int a[]=new int[n];
     System.out.println("enter data in array");
     for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
     }
     int count=0;
     for(int i=0;i<arr.length;i++){
       if((arr[i+1]-arr[i])==1)
          count++;
       else if((arr[i+1]-arr[i])==0)
          continue;
       else if((arr[i+1]-arr[i])!=1)) 
         continue;  
     }
     System.out.println("Longest Sequence length in array is : "+count);
   
   }




}
