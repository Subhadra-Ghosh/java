import java.util.Scanner;
public class Assig2_40{
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a product purchase cost");
        int purchasecost=sc.nextInt();
        System.out.println("Enter a product selling cost");
        int sellingcost=sc.nextInt();
        if (sellingcost>purchasecost){
               int profit= sellingcost-purchasecost;
               System.out.println(" your profit is:"+ profit);
               
          }
        else{  
                int loss=purchasecost-sellingcost;
               System.out.println(" your loss is :"+loss); 
             }   
    }
}
