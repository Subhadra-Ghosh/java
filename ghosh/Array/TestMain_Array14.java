/*Q.14. Find the first non-repeating elment in given array of integers
Find the first non-repeating element in a given array arr of N integers.
Note: Array consists of only positive and negative integers and not zero.
Example 1:
Input : arr[] = {-1, 2, -1, 3, 2}
Output : 3
Explanation:
-1 and 2 are repeating whereas 3 is 
the only number occuring once.
Hence, the output is 3.

Example 2:
Input : arr[] = {1, 1, 1}
Output : 0*/
import java.util.Scanner;
class Array{
   public void firstNonRepeting(int arr[]){   
          for(int i=0;i<arr.length;i++){
          int rep=0;
              for(int j=0;j<arr.length;j++){
                  if(arr[i]==arr[j])
                    rep++;
              }
              if(rep<2){
                 System.out.println(" First non repeting element is : "+arr[i]);  
                 break;  
              }
              
          }  
   }
}
public class TestMain_Array14{
  public static void main(String [] args){
     Scanner sc=new Scanner(System.in);
     int arr[]={1,5,1,2,5,80};
     Array obj=new Array();
     obj.firstNonRepeting(arr);
       
  }
}
