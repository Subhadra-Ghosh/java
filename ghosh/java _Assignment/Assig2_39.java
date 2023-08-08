import java.util.Scanner;
public class Assig2_39{
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter your amount ");
        int amount=sc.nextInt();
        int a=amount/2000;
        System.out.println("number of 2000 notes is :"+a);
        int b=(amount%2000)/500;
        System.out.println("number of 500 notes is :"+b);
        int c=((amount%2000)%500)/200;
        System.out.println("number of 200 notes is :"+c);
        int d=(((amount%2000)%500)%200)/100;
        System.out.println("number of 100 notes is :"+d);
        int e=((((amount%2000)%500)%200)%100)/50;
        System.out.println("number of 50 notes is :"+e);
        int f=(((((amount%2000)%500)%200)%100)%50)/20;
        System.out.println("number of 20 notes is :"+f);
        int g=((((((amount%2000)%500)%200)%100)%50)%20)/10;
        System.out.println("number of 10 notes is :"+g);
        int h=(((((((amount%2000)%500)%200)%100)%50)%20)%10)/5;
        System.out.println("number of 5 notes is :"+h);
        int totalnotes=a+b+c+d+e+f+g+h;
        System.out.println("total number of notes is :"+totalnotes);
    }
}
