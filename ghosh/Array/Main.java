public class Main{
       public static void main(String[]args){
           System.out.println("Enter your toy name");
           toyname=sc.nextLine();
           System.out.println("Enter your toy price");
           price=sc.nextInt();
           System.out.println("Enter your toy made country");
           madein=sc.nextLine();
           System.out.println("Enter your toy model no");
           model_no=sc.nextInt();
           System.out.println("Enter toy reference");
           toy_ref=sc.nextLine();
           Toy obj1=new Toy(toyname,price,madein);
           obj1.display();
           Toy.display();
           ElectronicToy obj2=new ElectronicToy(model_no,toy_ref);
           obj2.printAll();
   }  
