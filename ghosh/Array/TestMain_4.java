import java.util.Scanner;
 class Number{
    public static void table(int n){
       System.out.println("Table of "+n+ " is  :");
       int table=0;
       for(int i=1;i<=10;i++){
          table=n*i;
          System.out.println(table);     
       } 
    }
}
 class TestMain_4{   
      public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number for write  table");
         int n=sc.nextInt();
         Number  obj=new Number();
         obj.table(n);    
   }   
}
