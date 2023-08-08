import java.util.Scanner;
class Test{
   private int n;
   public void setData(int n){
    this.n=n;
   }
   public void  fibonacciSeries(){ 
     int a=-1,b=1,c;
     for(int i=0;i<n;i++){
      c=a+b;
      System.out.print(" "+c);
      a=b;
      b=c;
     }
     System.out.println();
   }
}
 class TestMain10{
  public static void main(String [] args){
     Scanner sc=new Scanner(System.in);
     Test obj=new Test();
     obj.setData(8);
     obj.fibonacciSeries();       
  }
}
