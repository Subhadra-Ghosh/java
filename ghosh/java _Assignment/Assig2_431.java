import java.util.Scanner;
public class Assig2_431{    
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter your unit of electricity");
        int unit=sc.nextInt();
        float bill, surcharge,totalbill;
        if(unit<=50){
                bill=unit*0.50f;
                 System.out.println("total bill is:"+bill);}
           
         else if(unit<=50  && unit<=150){
                bill=unit*0.75f;
                 System.out.println("total bill is:"+bill);}
          
         else if(unit<=150 && unit<=250){
                bill=unit*1.20f;
                 System.out.println("total bill is:"+bill);}
           
         else if( unit>=250){
                bill=unit*1.50f;
                surcharge=bill*20/100;
                totalbill=bill+surcharge;
                System.out.println("total bill is:"+totalbill);}
    }          
}
