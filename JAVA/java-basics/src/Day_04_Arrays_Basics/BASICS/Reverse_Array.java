// reverse the array
package Day_04_Arrays_Basics;
import java.util.Scanner;
class Reverse_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements");
        for(int i = 0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Given Array is:->");
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        for(int i =0;i<n/2;i++){
            int temp = arr[i];
            arr[i]=arr[n-1-i];
            arr[n-i-1] = temp;
        }
        System.out.println();
        System.out.println("Reversed Array is:->");
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
