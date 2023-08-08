/*40. Write a program to Convert any type of value to string value using String.valueOf() method    */
import java.util.Scanner;
 class Test {
    public void convert(char ch,int in,byte by) {
        String s1="";      

        s1=s1+ch;
       System .out.println("charactor value change in string : "+s1);       
        String s2="";
        s2=s2+by; 
        System .out.println("byte value change in string : "+s2);              
        String s3="";        
        s3=s3+in;
        System .out.println("integer value change in string : "+s3);       
    }
  }
            
        // System.out.println(p);
              
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a char value ");
        char ch = sc.next().charAt(0);
        System.out.println("Enter a integer value ");
        int in =sc.nextInt();     
        System.out.println("Enter a byte value ");
        byte by = sc.nextByte();
         new Test().convert(ch,in,by);
        
}
}

