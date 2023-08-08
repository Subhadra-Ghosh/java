import java.util.Scanner;
public class LongestSequence_20{
   public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter size of aray");
     int n=sc.nextInt();
     int arr[]=new int[n];
     System.out.println("enter data in array");
     for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
     }
     int count=0;
     System.out.print("sort");
     for(int i=0;i<arr.length;i++){
       for(int j=i+1;j<arr.length;j++){
          if(arr[i]>arr[j]){
            int temp=arr[i];
             arr[i]=arr[j];
             arr[j]=temp;
           }      
       }
     System.out.print(" "+arr[i]);
     }
     for(int i=0;i<arr.length-1;i++){
       if((arr[i+1]-arr[i])==1)
          count++;
      else if((arr[i+1]-arr[i])==0)
          continue;
       if((arr[i+1]-arr[i])!=1) 
          continue;  
     }
     System.out.println("\nLongest Sequence length in array is : "+count);=[=
   }




}
