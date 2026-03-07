package Day_04_Arrays_Basics.Searching_and_Frequency;

import java.util.Scanner;

class Indice_Of_Element_Given {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements");
        for(int i = 0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the element to find it's all indices");
        int find = sc.nextInt();

        System.out.println("Given Array is:->");
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        System.out.println("Element found at indices:-->");
        for(int i =0;i<n;i++){
            if(arr[i]==find){
                System.out.print(i+" ");
            }
        }
    }
}
