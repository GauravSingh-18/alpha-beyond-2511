package Day_04_Arrays_Basics;

import java.util.Scanner;

class Elements_At_Even_Odd_Indices {
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

        System.out.println();
        System.out.println("Elements at even indices are:-->");
        for(int i = 0;i<n;i++){
            if(i%2==0){
                System.out.print(arr[i]+" ");
            }
        }

        System.out.println();
        System.out.println("Elements at Odd indices are:-->");
        for(int i = 0;i<n;i++){
            if(i%2!=0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
