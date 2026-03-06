package Day_04_Arrays_Basics.Searching_and_Frequency;

import java.util.Scanner;

class Frequency {
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

        // lets start
        int[] freq = new int[n];
        int visited = -1;
        for(int i = 0;i<n;i++){
            int count = 1;
            for(int j = i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                    freq[j] = visited;
                }
            }
            if(freq[i]!=visited){
                freq[i]=count;
            }
        }

        System.out.println();
        for(int i = 0;i<n;i++){
            if(freq[i] != visited){
                System.out.println("Element"+" "+arr[i]+" has frequency of :--->"+" "+freq[i]);
            }
        }

    }
}
