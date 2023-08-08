import java.util.Scanner;
class celcius{
    public double celciusconvert(int f){
      double c=(f-32)*5/9; 
      return c;
   }     
}
class TestMain{
  public static void main(String [] args){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter tempreture in fehrenhite");
   int f=sc.nextInt();
   celcius obj=new celcius();
   double c=obj.celciusconvert(f);
   System.out.println(" tempreture in celcius from fehrenhite : "+c);
 }
} 
