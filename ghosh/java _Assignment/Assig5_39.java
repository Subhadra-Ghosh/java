import java.util.Scanner;
public class Assig5_39{
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter avalue of n ");
        int n=sc.nextInt();
        int i,temp,sum=0,fact=1;
        temp=n;
        for(i=1;i<=n;i++){
          int rem=n%10;
          fact=fact*i;
          sum=sum+fact;
          n=n/10;
          
        }
        System.out.println(sum);
        if(sum==temp)
         System.out.println("number is strong");
         else
         System.out.println("number is not strong");
    }
}
