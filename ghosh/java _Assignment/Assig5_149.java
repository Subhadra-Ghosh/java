import java.util.Scanner;
public class Assig5_149{
  public static void main(String[] args){
    int s=1;
    for( int i=1;i<=6;i++){
      for(int j=6 ;j>i;j--){
      
         System.out.print(" ");
         }
      for(int k=1;k<=s;k++){
         if(k==1  || k==s|| k==3 ||k==(s-2) ||k==5 ||k==7)
             System.out.print("1");
         else if( k==2 || k==(s-1)|| k==4 ||k==(s-3) || k==6)
             System.out.print("0");
        
      }
      s=s+2;
      System.out.println();
      }
  }     
}
