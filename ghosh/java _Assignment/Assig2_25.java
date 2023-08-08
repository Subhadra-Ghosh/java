import java.util.Scanner;
public class Assig2_25{
    public static void main(String[]args){
        int temp=0;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a number ");
        int number=sc.nextInt();
        int p=number%2;
        switch(p){
            case 0:
                System.out.println("number is even");
                break;
            case 1:
                System.out.println("number is odd");
                break;   
           
    
          }
    
    
    }    
        
}
