import java.util.Scanner;
public class Arry6{
   public static void main(String[]args){
     int j;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter size of arry");
     int n=sc.nextInt();
     int a[]=new int[n];
     System.out.println("Enter"+ n+" numbers");
     
     for(int i=0;i<n;i++){
        a[i]=sc.nextInt(); 
     }
     boolean status=true;
      for(int i=0;i<n;i++){
         status=true;
         for( j=2;j<=a[i]/2;j++){
            if(a[i]%j==0){
               status=false;
               break;}
              //System.out.println("");
         }
         
         if(status && a[i]>1 )
            System.out.println("prime number in arry is : "+a[i]);    
         else
            System.out.println(" Not prime number in arry is : "+a[i]);        
     }
     
    
          
   }
       
}
     
   






