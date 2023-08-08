/*10. Write a Java program to get the contents of a given string as a byte array
 */    
import java.util.Scanner;
 class Byte {
    public String bytearr(String s) {
       
        return s;
    }  
 }
    
   
         
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array byte values ");
        byte arr[]=new byte[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextByte();
        }
        String s =new String(arr);
       String c= new Byte().bytearr(s);
        System.out.println(c);
    }
}
