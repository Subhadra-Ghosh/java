import java.util.Scanner;
class Test{
   public void alphabet(char letter){
      switch(letter){
        case 'A':         
        case 'E':          
        case 'I':         
        case 'O':           
        case 'U':          
        case 'a':          
        case 'e':          
        case 'i':         
        case 'o':         
        case 'u':
           System.out.println("vowel");
           break;
        default :
           System.out.println("consonant");
        }
     }
   }  
class TestMain4{   
      public static void main(String[] args) {          
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a letter for cheack ");
         char letter=sc.next().charAt(0);
         Test obj=new Test();
         obj.alphabet(letter);
        }
}   

