
public class Assig{
    public static void main(String[]args){
        int i=1,n=4,sum=0;
       
       
        while(i<=n)
        {
          if(i%2==0)
             sum=sum-i;
          else
             sum=sum+i;
             i++;
           } 
        System.out.println(sum);
        
    }    
        
}
