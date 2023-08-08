
//37. Write a Java program to Count Number of Uppercase and Lowercase letters
import java.util.Scanner;
 class Test {
    public void upperLowerCount(char ch[]){
        int uppercount=0,lowercount=0;
        for(int i=0;i<ch.length;i++){
            if( ch[i] >=65 && ch[i]<=90){
               uppercount++; 
            }    
           else if( ch[i] >=97 && ch[i]<=122){
               lowercount++; 
            }                    
        }
       System.out.println("Lowercase : "+lowercount+"\nUppercase : "+uppercount); 
    }

 }

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        char ch[]=s.toCharArray();
        new Test().upperLowerCount(ch);
    }

}