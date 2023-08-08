import java.util.Scanner;
class MovieBill{
    public void bill(int pizza,int puffs,int colddrink){
      System.out.println("\t\t\t: Your Bill :");
      System.out.println("Product Name           Quantity        Price          Total");
      System.out.println("pizza\t\t\t"+pizza+"\t\t100"+"\t\t"+(pizza*100));
      System.out.println("puffs\t\t\t"+puffs+"\t\t20"+"\t\t"+(puffs*20)); 
      System.out.println("ColdDrink\t\t"+colddrink+"\t\t10"+"\t\t"+(colddrink*10));
      System.out.println("-------------------------------------------------------------");
      System.out.println("\t\t\t\t\t\tTotal :"+((pizza*100)+(puffs*20)+(colddrink*10)));  
      System.out.println("-------------------------------------------------------------");
   }     
}
class TestMain{
  public static void main(String [] args){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the Quantity of pizza ");
   int pizza=sc.nextInt();
   System.out.println("Enter the  Quantity of puffs ");
   int puffs=sc.nextInt();
   System.out.println("Enter the  Quantity of colddrinks ");
   int colddrink=sc.nextInt();
   MovieBill obj=new MovieBill();
   obj.bill(pizza,puffs,colddrink);
 }
} 
