import java.util.Scanner;
public class Assig5_116{
 public static void main(String []args){
   for(char  i=69;i>=65;i--){
     for(char j=65 ;j<=134-i;j++){
        System.out.print(" ");
     }
     for(char j=65;j<=i;j++){
              System.out.print(j);
     }
    System.out.println("");
    }
 }
}
