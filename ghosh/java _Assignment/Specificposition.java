import java.util.Scanner;

public class Specificposition{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("data is array");
        for (int i = 0; i < n; i++) {
           arr[i]=sc.nextInt();

        }
        System.out.println("position");
        int k=sc.nextInt();
        System.out.println("Data");
        int s=sc.nextInt();
        arr[k]=s;
        System.out.println("new array is :");
        for (int i = 0; i <n; i++) {
           System.out.println(arr[i]);

        }
    }

}
