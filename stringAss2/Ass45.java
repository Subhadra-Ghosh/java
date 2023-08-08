/*  Writea program to Check given strings are Anagram or not */
import java.util.Scanner;
class Test {
    public void stringDigits(char ch1[] ,char ch2[]){
        int count=0;
       for(int i=0;i<ch1.length;i++){
            for(int j=0;j<ch2.length;j++){
                 if(ch1[i]==ch2[j]){
                     count++;
                 }
            }  
       }
       if(count==ch1.length){
         System.out.println(" strings are Anagrams");
       }
       else{
          System.out.println(" strings are not Anagrams");
       }
    }
}
class TestMain{
   public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a 1st string");
     String s1=sc.nextLine();
     char ch1[]=s1.toCharArray();
     System.out.println("Enter a 2nd string");
     String s2=sc.nextLine();
     char ch2[]=s2.toCharArray();
     Test obj=new Test();
     obj.stringDigits(ch1,ch2);
   }

}