/*17. Write a Java program to replace each substring of a given string that matches the given regular expression with the given replacement
 */

import java.util.Scanner;
 class Test {
    public void check(String s,String exp,String place) {
        String p="";
        for (int i = 0; i < s.length(); i++) {
             String c="";
             for(int j=i;j<s.length();j++){
                  c= c+s.charAt(j);
                  if(c.equals(exp)){
                     c=place;
                     
                  }
                 
             }
             p=p+c; 
               System.out.println(p); 
         }
        // System.out.println(p);
    }           
}
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String s = sc.nextLine();
        System.out.println("Enter the regular expression ");
        String exp = sc.nextLine();
        System.out.println("Enter the replacement string ");
        String place = sc.nextLine();
        new Test().check(s,exp,place);
    }
}
