import java.util.Scanner;
public class Assig2_15{
    public static void main(String[]args){
        int temp=0;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter bike cost price");
        int cost=sc.nextInt();
        if(cost>100000)
            System.out.println("your road tex on bike is"+(cost*15/100));
        else if(50000>cost && cost<=100000)
            System.out.println("your road tex on bike is"+(cost*10/100)); 
        else
            System.out.println("your road tex on bike is"+(cost*5/100)); 
      
         
        
    
    }    
        
}
