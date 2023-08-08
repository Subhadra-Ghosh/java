import java.util.Scanner;
public class Arry2{
   public static void main(String[]args){
     int ans=-1;
     String a[]=new String[5];
     System.out.println("Enter 5 words");
     Scanner sc=new Scanner(System.in);
     for(int i=0;i<5;i++){
        a[i]=sc.nextLine(); 
     }
      System.out.pr*++intln("words are ---");
      for(int i=0;i<5;i++){
        System.out.println(a[i]);
     }
     System.out.println("Enter a particular word to check");
     String b=sc.nextLine();
     for( int i=0;i<5;i++){
        if(a[i]==b){
           ans=i;
           System.out.println("found your word"+b);
          
        }
        else
           System.out.println("not found word");
     }
     
   }





}
