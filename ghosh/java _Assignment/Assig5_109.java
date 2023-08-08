import java.util.Scanner;
public class Assig5_109{
 public static void main(String []args){
   for(char i=65;i<=69;i++){
     for(char j=69;j>i;j--){
        System.out.print(" ");
     }
     for(char j=65;j<=i;j++){
        if((i==67 && j==66) || (i==68 && j==66)||(i==68 && j==67))
           System.out.print("_");
        else
           System.out.print(j);
     }
    System.out.println("");
    }
 }


}
