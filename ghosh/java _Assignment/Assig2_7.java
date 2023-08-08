import java.util.Scanner;
public class Assig2_7{
    public static void main(String[]args){
        System.out.println("Enter a number  how many  classes are held ");
        Scanner sc=new Scanner(System.in);
        int held=sc.nextInt();
        System.out.println("Enter a number of' how many classes you attend' ");
        int attend=sc.nextInt();
        float per=100*(attend/held);
        System.out.println("you percentage of attending classes is:"+per);
        if (per<75)
               System.out.println("you are not allowed to attend exam");
        else
               System.out.println("you are  allowed to attend exam");
          
    }
}
