import java.util.Scanner;
class Time{
   private int hour,min,sec;
   public Time(int hour,int min,int sec){
      this.hour=hour;
      this.min=min;
      this.sec=sec;  
   }
   public Time(){}   
   public Time addTime(Time t){
        Time temp=new Time();
        temp.hour= this.hour + t.hour;
        temp.min= this.min + t.min;
        temp.sec= this.sec + t.sec;
        if(sec>=60  ){
           temp.min++;
           temp.sec-=60; 
         }
        if(min>=60){
          temp.hour++;
          temp.min-=60;
        }
    return temp;      
   }
   public void display(){
      System.out.println("Hour : "+hour+"\nminute : "+min+"\nSecond : "+sec);
   }    
}
 class TestMain{
  public static void main(String [] args){
    Time t1=new Time(5,70,80);
    Time t2=new Time(5,10,10);
    Time t3=t1.addTime(t2);
    t3.display();
       
  }
}
