public class Assig4_22{
    public static void main(String[]args){
       for(int i=101;i<=199;i++){
           int n=i;
           int reverse=0 ;
           while(n!=0)
            {  
               
             int rem=n%10;
             reverse=reverse*10+rem;
             n=n/10;
             //System.out.println(reverse);
            }
            System.out.println(reverse);

         } 
    }




}
