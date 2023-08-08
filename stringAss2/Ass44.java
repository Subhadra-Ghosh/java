/*44. Write a program to String concatenation with primitive data type values   *****
 */
import java.util.Scanner;
 class Test {
    public void convert(char ch[],int in[],byte by[]) {
         String s1="";
        for(int i=0;i<ch.length;i++){
          s1=s1+ch[i];
        }
        String s2="";
        for(int i=0;i<by.length;i++){
          s2=s2+by[i];
        }
        String s3="";
        for(int i=0;i<in.length;i++){
          s3=s3+in[i];
        }
        String s4=s1+s2+s3;
        System.out.println(" concatenate String is : "+s4);
    }
  }
            
        // System.out.println(p);
              
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a char array ");
        char ch[] = new char[5];
        for(int i=0;i<ch.length;i++){
            ch[i]=sc.next().charAt(0);
        }
        System.out.println("Enter a integer array ");
        int in[] = new int[5];
        for(int i=0;i<in.length;i++){
            in[i]=sc.nextInt();
        }
        System.out.println("Enter a byte array ");
        byte by[] = new byte[5];
        for(int i=0;i<by.length;i++){
            by[i]=sc.nextByte();
        }
  

       
         new Test().convert(ch,in,by);
        
}
}

