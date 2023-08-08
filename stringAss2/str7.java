    
import java.util.Scanner;
 class SameData {
    public boolean equal(char ch1[], char ch2[]) {   
         int count=0;
        for (int i = 0; i < ch1.length; i++) {
           for (int j = 0; j < ch2.length; j++) {
                if (ch1[i] == ch2[j]) {
                  count++;  
                }  
        }
    }
    System.out.println(count);
       if(count==ch1.length){
        
           return true;
       }
       else
           return false;
    }
}
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first  String ");
        String s1 = sc.nextLine();
        System.out.println("Enter the second String");
        String s2 = sc.nextLine();
        char ch1[] = s1.toCharArray();
        char ch2[] = s2.toCharArray();
        SameData obj = new SameData();
        boolean flag=obj.equal(ch1, ch2);
        System.out.println(flag);   
    }
}
