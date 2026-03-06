package Day_04_Arrays_Basics.BASICS;

import java.util.Scanner;

class Count_Positive_Negative_Zero {
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

        int pos = 0;
        int neg = 0;
        int zero = 0;
        for(int i = 0;i<n;i++){
            if(arr[i]>0){
                pos++;
            }
            else if(arr[i]<0){
                neg++;
            }
            else{
                zero++;
            }
        }
        System.out.println();
        System.out.println("No. Of positive elements are:->"+" "+pos+"\n and No. of negative elements are:->"+" "+neg+"\n and no. of zeroes are:->"+" "+zero);
    }
}
