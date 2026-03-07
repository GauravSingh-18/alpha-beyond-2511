package Day_04_Arrays_Basics.Searching_and_Frequency;

import java.util.Scanner;

class Linear_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements");
        for(int i = 0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the number to search");
        int find = sc.nextInt();

        System.out.println("Given Array is:->");
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        for(int i = 0;i<n;i++){
            if(arr[i]==find){
                System.out.println("Element"+" "+find+" found in the array");
                return;
            }
        }
    }

}
