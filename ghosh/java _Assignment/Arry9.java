import java.util.Scanner;
public class Arry9{
   public static void main(String[]args){
   
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter number  of row in arry");
     int a=sc.nextInt();
     System.out.println("Enter number  of colomn in arry");
     int b=sc.nextInt();
     int n[][]=new int[a][b];
     System.out.println("Enter elements of 2D array");
     for(int i=0;i<a;i++){
        for(int j=0;j<b;j++){
            n[i][j]=sc.nextInt();
     }
     }
      System.out.println("numbers  of 2D arry are ...");
      for(int i=0;i<a;i++){
         for(int j=0;j<b;j++){
              System.out.print(" "+n[i][j]);
       }
       System.out.println();
     }
    
          
    
       
     
     
  } 
}





