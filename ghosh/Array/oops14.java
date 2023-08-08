import java.util.Scanner;
class Mathopration{
   private int  x,y,r;
   public Mathopration(int x,int y){
      this.x=x;
      this.y=y;
   }
   public void add(){
     r=x+y;  
   }
   public void multiply(){
     r=x*y;
   }
   public void power(){
      r=1;
      for(int i=1;i<=y;i++){
        r=r*x;
      }     
   }
   public void display(){
     System.out.println("Result : "+r) ;
   }     
}
class TestMain{
  public static void main(String [] args){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the value of x ");
   int x=sc.nextInt();
   System.out.println("Enter the value of y ");
   int y=sc.nextInt();
   Mathopration obj = new Mathopration(x,y);  
   obj.add();
   obj.display(); 
   obj.multiply();
   obj.display(); 
   obj.power();
   obj.display(); 
  }
}
