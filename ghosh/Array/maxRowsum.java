import java.util.Scanner;
public class MaxRowsum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row of array ");
        int r= sc.nextInt();
         System.out.println("Enter colon of array ");
        int c= sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("Enter array elements ");
         for ( r = 0; r<arr.length; r++) {
            for(c=0;c<arr[r].length;c++){
               arr[r][c]=sc.nextInt();
            }
        }
        int x[]=new int[r];
        int temp=0;
        for ( r = 0; r<arr.length; r++) {
            for(c=0;c<arr[r].length;c++){
                 x[r]=x[r]+arr[r][c];
            }
        }
        int maxrowsum=0;
        for( r=0;r<arr.length;r++){
          if(maxrowsum<x[r]){
             maxrowsum=x[r];
            temp=r;}
           }
        System.out.println((temp+1)+"rd row has  "+maxrowsum+" max row sum . ");
        System.out.println((temp+1)+"rd row elements :-");
        for( c=0;c<arr[temp].length;c++)
            System.out.println(arr[temp][c]);
        }
    } 
