import java.util.Scanner;
public class Assig2_13{
    public static void main(String[]args){
        int temp=0;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a number between 1 to 7 display week days");
        int number=sc.nextInt();
        switch(number){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;   
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Tharsday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("saterday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
    
          }
    
    
    }    
        
}
