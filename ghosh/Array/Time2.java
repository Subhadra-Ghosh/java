import java.util.Scanner;
class Time{
   private int hour,min,sec;
   public Time(int hour,int min,int sec){
      this.hour=hour;
      this.min=min;
      this.sec=sec;  
   }
   public Time(){}   
   public void addTime(Time t1,Time t2){
        this.hour= t1.hour + t2.hour;
        this.min= t1.min + t2.min;
        this.sec= t1.sec + t2.sec;
        if(sec>=60){
           this.min++;
           this.sec-=60; 
         }
        if(min>=60){
          this.hour++;
          this.min-=60;
        }     
   }
   public void display(){
      System.out.println("Hour : "+hour+"\nminute : "+min+"\nSecond : "+sec);
   }    
}
 class TestMain1{
  public static void main(String [] args){
    Time t1=new Time(5,70,80);
    Time t2=new Time(5,10,10);
    Time t3=new Time();
    t3.addTime(t1,t2);
    t3.display();
       
  }
}
