/*2. Write a Java program to get the character at the given index within the String*/


 class Test {
    public void  index(String s,int i){
      char ch[]=s.toCharArray();
      System.out.println(i+" position charactor is : "+ch[i]);  
    }
}
class TestMain{
    public static void main(String args[]){
        System.out.println("Enter string");
        String s=new java.util.Scanner(System.in).nextLine();
        System.out.println("Enter the index");
        int i=new java.util.Scanner(System.in).nextInt();
         new Test().index(s,i); 
    }
}
