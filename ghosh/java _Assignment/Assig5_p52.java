import java.util.Scanner;
public class Assig5_p52{
 public static void main(String []args){
   for(int  i=5;i>=1;i--){
     for(int j=1 ;j<=6-i;j++){
        System.out.print(" ");
     }
     for(int j=1;j<=i;j++){
           if((i==4 && j==2) || (i==4 && j==3)|| (i==3 && j==2))
              System.out.print("_");
           else
              System.out.print(j);
     }
    System.out.println("");
    }
 }


}
