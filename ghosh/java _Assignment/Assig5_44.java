import java.util.Scanner;
public class Assig5_44{
 public static void main(String[]rgs){
    System.out.println("Enter a number");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int count=0,rem;
     int temp=n;
    for(int i=1;temp!=0;i++){
      rem=temp%10;
      count++;
      temp=temp/10;
    } 
    int last=n%10;
    int d=count-2;
    n=n/10;
    int divide=1;
    for(int j=1;j<=d;j++){
       divide=divide*10;
    }
    int between=n%divide;
    int first=n/divide;
    int interchange=(last*divide+between)*10+first;
    System.out.println("After interchange number is: "+interchange);
 
 }


}
