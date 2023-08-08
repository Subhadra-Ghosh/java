import java.util.Scanner;
class Pattern{
    public Pattern(){
     }   
    public void display(){
      for(char i=68;i>=65;i--){
        for(char j=65;j<=i;j++){
           System.out.print(j+" ");
        }
        System.out.println();
      }
    }
}     
class TestMain{
  public static void main(String [] args){
   Scanner sc=new Scanner(System.in);
   Pattern obj=new Pattern();
   obj.display(); 
   }
 }
 
