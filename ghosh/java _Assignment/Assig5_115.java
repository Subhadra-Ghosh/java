import java.util.Scanner;
public class Assig5_115{
 public static void main(String []args){
   for(char  i=69;i>=65;i--){
     for(char j=65 ;j<=134-i;j++){
        System.out.print(" ");
     }
     for(char j=65;j<=i;j++){
           if((i==68 && j==66) || (i==68 && j==67)|| (i==67 && j==66))
              System.out.print("_");
           else
              System.out.print(j);
     }
    System.out.println("");
    }
 }


}
