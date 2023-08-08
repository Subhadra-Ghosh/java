import java.util.Scanner;
class Test{
   public void Greater(int a,int b,int c){ 
       if(a>=20 && a<b && a<c)
          System.out.println(a+" is greater than 20 and less than othres");
       else if(b>=20 && b<a && b<c){
          System.out.println(b+" is greater than 20 and less than othres");
       } 
       else if(c>=20 && c<a && c<b){
          System.out.println(c+" is greater than 20 and less than othres"); 
        
      }  
      else
         System.out.println("No such number is present"); 
    
   }
}
 class TestMain6{
  public static void main(String [] args){
     Scanner sc=new Scanner(System.in);
     Test obj=new Test();
     obj.Greater(56,67,12);
       
  }
}
