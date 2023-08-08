import java.util.Scanner;
public class SwapRow{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row of array ");
        int r= sc.nextInt();
         System.out.println("Enter colon of array ");
        int c= sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("Enter array elements ");
         for ( r = 0; r<arr.length; r++) {
           System.out.println("Enter "+(r+1)+ " row elements  ");
            for(c=0;c<arr[r].length;c++){
               arr[r][c]=sc.nextInt();
            }
        }
        for ( r = 0; r<arr.length; r++) {
            for(c=0;c<arr[r].length;c++){
             System.out.print(arr[r][c]+" ");
            }
             System.out.println(); 
        }
        int x[]=new int[r];
        int temp=0;
        for ( r = 0; r<arr.length; r++) {
            for(c=0;c<arr[r].length;c++){
                 x[r]=x[r]+arr[r][c];
            }
        }        
        int maxrowsum=0,minrowsum=x[0],secmax=0,secmin=x[arr.length-1];
        for( r=0;r<arr.length;r++){
          if(maxrowsum<x[r])
             maxrowsum=x[r];
          if(minrowsum>x[r])
             minrowsum=x[r]; 
           }  
         System.out.println("max row sum "+maxrowsum);
         System.out.println("min row sum "+minrowsum);
           int temp1=0,temp2=0;  
        for( r=0;r<arr.length;r++){
          if((x[r] < maxrowsum) && (secmax < x[r])){
             secmax=x[r]; 
             temp1=r;
             } 
          if( (x[r] > minrowsum ) && ( secmin > x[r])){
             secmin=x[r]; 
             temp2=r;
           } 
           }       
         System.out.println("second max row index "+temp1);
         System.out.println("second min row index "+temp2);       
         System.out.println("secmax "+secmax);
         System.out.println("secmin "+secmin);
         for(c=0;c<arr.length;c++){
           int swap=arr[temp1][c];
           arr[temp1][c]=arr[temp2][c];
           arr[temp2][c]=swap;
         }         
          for ( r = 0; r<arr.length; r++) {
            for(c=0;c<arr[r].length;c++){
                System.out.print(arr[r][c]+" ");
            }
            System.out.println();
        }        
     }
}     
