import java.util.Scanner;
public class Assig5_p63{
 public static void main(String[]args){
   char s=65;
   for( char i=65;i<=69;i++){
      for(char j=69;j>i;j--){
        System.out.print(" ");
      }
      for(char k=65;k<=s;k++){
        System.out.print(k);
      }
    s+=2;
    System.out.println("");  
   }
 
 
 }





}
