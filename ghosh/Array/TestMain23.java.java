import java.util.Scanner;
class Array{
    public int  checkNumber(int arr[],int k){
    boolean flag=true;
      for(int i=0;i<arr.length;i++){
          if(arr[i]==k)
             flag=false;
     }
     if(flag)
       return k;
   }     
}
class TestMain{
  public static void main(String [] args){
   Scanner sc=new Scanner(System.in);
   Array obj=new Array();
   System.out.println("Enter anumber for check");
   int k=sc.nextInt();
   int s=obj.reverse(new int[]{3,5,5,4,9},k);
   System.out.println(s+" number is found");
   }
 }
 
