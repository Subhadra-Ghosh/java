import java.util.Scanner;
class Student{
   private int rollNo,age,score;
   private String name;
   public Student(String name,int rollNo,int age,int score){
     this.name=name;
     this.rollNo=rollNo;
     this.age=age; 
     this.score=score;       
   }
    public Student(){   
    }
   public void studentArrange(){
       if( 0<=this.score && 50>=this.score){
          System.out.println(this.name+" lie in [0-50] group");
       }
       else if ( 50<this.score && 65>=this.score){
          System.out.println(this.name+" lie in [50-65] group");
       }
       else if ( 65<this.score && 80>=this.score){
          System.out.println(this.name+" lie in [65-80] group");
       }
       else {
          System.out.println(this.name+" lie in [80-100] group");
       }
   } 
}
class TestMain{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      Student s[]=new Student[3];
      for(int i=0;i<3;i++){
        System.out.println("Enter "+(i+1)+" student name");
        String name=sc.next();
        System.out.println("Enter "+(i+1)+" student roll number");
        int rollNo=sc.nextInt();
        System.out.println("Enter "+(i+1)+" student age");
        int age=sc.nextInt();
        System.out.println("Enter "+(i+1)+" student Score");
        int score=sc.nextInt();
        s[i]=new Student(name,rollNo,age,score);
      }
      for(int i=0;i<3;i++){
         s[i].studentArrange();
      }
   }   
}
