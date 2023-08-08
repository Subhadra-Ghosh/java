	`import java.util.Scanner;
class Product{
   private int pid,price,quantity;
   int amount;
   private static int totalamount=0;
   public Product(int pid,int price,int quantity){
     this.pid=pid;
     this.price=price;
     this.quantity=quantity;    
   }
    public Product(){   
    }
   public void singleproductamount(Product p[]){
      for(int i=0;i<5;i++){
         p[i].amount=p[i].price*p[i].quantity;
         System.out.println((i+1)+" product amount : "+p[i].amount);
         totalamount+=p[i].amount;
      }
   }
   public static void totalamount(){
       System.out.println(" TotalAmont is : "+totalamount);
   }
   public static void higestpricepid(int k){
       System.out.println(" Higest price product ID  is : "+k);
   }
}
class TestMain{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      Product p[]=new Product[5];
      int max=Integer.MIN_VALUE;
      int k=0;
      for(int i=0;i<5;i++){
        System.out.println("Enter "+(i+1)+" product id");
        int pid=sc.nextInt();
        System.out.println("Enter "+(i+1)+" product price");
        int price=sc.nextInt();
        System.out.println("Enter "+(i+1)+" product quantity");
        int quantity=sc.nextInt();
        if(price>max){
           max=price;
           k=pid;
        }
        p[i]=new Product(pid,price,quantity);
      }
      Product obj=new Product();
      obj.singleproductamount(p);    
      Product.totalamount();
      Product.higestpricepid(k);  
   }
}
