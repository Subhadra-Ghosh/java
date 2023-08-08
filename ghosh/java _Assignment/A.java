import java.util.Scanner;
public class A{
  public static void main(String[] args){
    int a=1,b=11,c=12,d=18,e=19;
    for( int i=1;i<=6;i++){
     
      for(int k=1;k<=i;k++){
         if(k==1){
             System.out.print(" "+a);
             a++;
             }
         if(k==2){
             System.out.print(" "+b);
             b--;
             }
              if(k==3){
             System.out.print(" "+c);
             c++;
             }
              if(k==4){
             System.out.print(" "+d);
             d--;
             }
              if(k==5){
             System.out.print(" "+e);
             e++;
             }
              if(k==6){
             System.out.print(" 21");
             
             }
       } 
       System.out.println();
     }
  }     
}
