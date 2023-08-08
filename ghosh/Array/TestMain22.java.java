import java.util.Scanner;
class Array{
    public void reverse(int arr[]){
     System.out.println("REverse Array is :");
      for(int i=arr.length-1;i>=0;i--){
          System.out.println(arr[i]);
     }
   }     
}
class TestMain{
  public static void main(String [] args){
   Scanner sc=new Scanner(System.in);
   Array obj=new Array();
   obj.reverse(new int[]{3,5,5,4,9,5});
   }
 }
 
