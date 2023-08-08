import java.util.Scanner;
public class Arry15{
   public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
    
     char a[]=new char[8];
     System.out.println("input minus values");
     for(int i=0;i<8;i++){
       a[i]=sc.next().charAt(0); 
         }
     for(int i=0;i<8;i++){
       for(int j=0;j<10;j++){
         System.out.print(a[i]);
       
       }
     
        System.out.println();    
         }    
    
     
    
          
  }
}
     
   


