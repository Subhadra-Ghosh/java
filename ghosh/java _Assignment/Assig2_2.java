import java.util.Scanner;
public class Assig2_2{
    public static void main(String[]args){
        System.out.println("E quantity of your product");
        Scanner sc=new Scanner(System.in);
        int quantity=sc.nextInt();
        int totalamount=quantity*100; 
        System.out.println("your total amount is:"+totalamount);
        int discount=totalamount*10/100;
        if(totalamount>1000)
            System.out.println("your total amount after 10% discount is :"+(totalamount-discount));
        else
            System.out.println("your total amount without discount is: "+(totalamount));     
    }
}
