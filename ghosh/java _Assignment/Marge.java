import java.util.Scanner;
public class Marge{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array1 ");
        int n1= sc.nextInt();
        int arr1[]=new int[n1];
        System.out.println("Enter size of array2 ");
        int n2= sc.nextInt();
        int arr2[]=new int[n2];
        System.out.println("Enter array1 elements ");
        for (int i = 0; i<n1; i++) {
            arr1[i]=sc.nextInt();
            }
            System.out.println("Enter array2 elements ");
        for (int i = 0; i<n2; i++) {
            arr2[i]=sc.nextInt();
            }
        int arr3[]=new int[n1+n2];
        for (int i = 0,j=0; i<n1+n2; i++) {   
             if(i<n1){
                arr3[i]=arr1[i];
              }
              else{
                arr3[i]=arr2[j]; 
                j++;
                }        
        }
        System.out.println("marge array is : ");
        for (int i=0; i<n1+n2; i++) {   
            System.out.println(arr3[i]);
                }       
    }
}
