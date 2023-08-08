import java.util.Scanner;
public class Assig5_p67{
 public static void main(String[]args){
   char s=65;
   for( char i=65;i<=69;i++){
      for(char j=69;j>i;j--){
        System.out.print(" ");
      }
      for(char k=65;k<=s;k++){
      if((i==66 && k==66) ||(i==67 && (k==66 || k==67 || k==68)) || (i==68 && (k==66 || k==67 || k==68 || k==69 || k==70)))
         System.out.print(" ");
      else
         System.out.print(i);
      }
    s+=2;
    System.out.println("");  
   }
 }
}                                                                                
