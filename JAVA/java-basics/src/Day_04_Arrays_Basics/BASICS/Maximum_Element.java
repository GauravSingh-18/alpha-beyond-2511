package Day_04_Arrays_Basics.BASICS;

import java.util.Scanner;

class Maximum_Element {
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

        int max = arr[0];
        for(int i = 1;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println();
        System.out.println("maximum element is "+max);

    }
}
