public class Assig5_p23{
  public static void main(String []args){
      char s=97; 
      for( int i=1;i<=5;i++){
           for( int j=1;j<=i;j++){             
             if((i==3 && j==2) || (i==4 && (j==2 ||  j==3))){
                System.out.print(" ");
                s++;              
                }
             else{
                System.out.print(s);   
                s++;
                }
           }      
           System.out.println(" ");
      }
 
  } 
   
   
   
   
   
}
