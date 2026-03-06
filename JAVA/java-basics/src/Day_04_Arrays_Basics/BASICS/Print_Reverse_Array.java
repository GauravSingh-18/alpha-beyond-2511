// print the array in reverse
package Day_04_Arrays_Basics;
import java.util.Scanner;
class Print_Reverse_Array {
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

        System.out.println("Reverse Array is:->");
        for(int i =n-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
