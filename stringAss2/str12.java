/*12. Write a Java program to create a character array containing the contents of a string */    
import java.util.Scanner;
 class Char {
    public String chararr(String s) {
       
        return s;
    }  
 }
    
   
         
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array char values ");
        char arr[]=new char[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.next().charAt(0);
        }
       String s =new String(arr);
       String c= new Char().chararr(s);
       System.out.println(c);
    }
}

