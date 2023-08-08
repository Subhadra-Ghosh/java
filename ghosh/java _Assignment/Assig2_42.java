import java.util.Scanner;
public class Assig2_42{
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter your basic salary ");
        int basicsalary=sc.nextInt();
        if (basicsalary<=10000){
               float  HRA=basicsalary*20/100;
               float  DA=basicsalary*80/100;
               float Grosssalary=basicsalary+HRA+DA; 
               System.out.println(" your Gross salary is:"+Grosssalary);
             }    
         if (basicsalary<=20000){
               float  HRA=basicsalary*25/100;
               float  DA=basicsalary*90/100;
               float Grosssalary=basicsalary+HRA+DA; 
               System.out.println(" your Gross salary is:"+Grosssalary); 
               }    
         if (basicsalary>20000){
               float  HRA=basicsalary*30/100;
               float  DA=basicsalary*95/100;
               float  Grosssalary=basicsalary+HRA+DA; 
               System.out.println(" your Gross salary is:"+Grosssalary);     
              } 
              
         
    }
}
