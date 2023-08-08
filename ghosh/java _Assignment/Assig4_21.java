public class Assig4_21{
    public static void main(String[]args){
      int c=0;
      for(int i=101;i<=199;i++){
         for(int j=2;j<i;j++){
           if(i%j==0)
           {  
             c++;
               //System.out.println("not prime");
             } 
             
             
               
         }
         if(c==0)
            System.out.println(i);
            i++;
      
      
      }
    
    
    
    
    }









}   
