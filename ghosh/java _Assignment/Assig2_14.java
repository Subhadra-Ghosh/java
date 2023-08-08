import java.util.Scanner;
public class Assig2_14{
    public static void main(String[]args){
        int temp=0;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter your percentage");
        float per=sc.nextFloat();
         if(per>90)
            System.out.println("your grade is :A");
        else if(80<per && per<=90)
            System.out.println("your grade is :B"); 
       else if(60<per && per<=80)
            System.out.println("your grade is :C"); 
        else if( per<=60)
            System.out.println("your grade is :D"); 
          
         
        
    
    }    
        
}
