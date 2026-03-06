package Day_04_Arrays_Basics.BASICS;

import java.util.Scanner;
class Product_Of_Elements {
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

        int product = 1;
        for(int i = 0;i<n;i++){
            product = product*arr[i];
        }

        System.out.println();
        System.out.println("Product of elements are:-->"+product);
    }
}
