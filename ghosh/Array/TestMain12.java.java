import java.util.Scanner;
class prime{
   public void primecheck(){
    int i,j;
    System.out.println("Prime number are :"); 
    for( i=1;i<100;i++){
       for( j=2;j<=i/2;j++){
         if(i%j==0){
            break; 
        }   
      }
     if(j>i/2 && i>1){
       System.out.println(i); 
     }
  
    } 
  }    
}
class TestMain{
  public static void main(String [] args){
   Scanner sc=new Scanner(System.in);
   prime obj=new prime();
   obj.primecheck();
 }
} 
