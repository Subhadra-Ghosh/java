import java.util.Scanner;
public class SumConfiguration_21{
   public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter size of aray");
     int n=sc.nextInt();
     int arr[]=new int[n];
     System.out.println("Enter data in array");
     for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
     }
     int temp[]= new int[n];
     int max=0,i,j;
     for(int k=0;k<n;k++){
       for( i=n-k,j=0;i<n;i++){           
             temp[j++]=arr[i];
       }      
       for( i=0;i<n-k;i++){           
             temp[j++]=arr[i];
       }       
       int sum=0;
       for( i=0;i<n;i++){
         temp[i]=i*temp[i];
         sum=sum+temp[i];      
       }
       if(sum>max)
          max=sum;               
     }
     System.out.println("max sum configuration is : "+max);  
   }
}
