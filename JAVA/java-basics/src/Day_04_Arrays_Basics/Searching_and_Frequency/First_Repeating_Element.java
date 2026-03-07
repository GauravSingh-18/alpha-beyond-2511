package Day_04_Arrays_Basics.Searching_and_Frequency;

import java.util.Scanner;
// jo element sabse kam  no of index mein repeat kre
class First_Repeating_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements");
        for(int i = 0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Given Array is:-->");
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

       /* int[] freq = new int[n];
        int visited = -1;
        for(int i = 0;i<n;i++){
            int count = 1;
            for(int j = i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                    freq[j] = visited;
                }
            }
            if(arr[i] != visited){
                freq[i] = count;
            }
        }
        int index = 0;
        for(int i =0;i<n;i++){
            if(freq[i] > 1){
                index = i;
                break;
            }
        }*/
        int minindex = n;

        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    if(j<minindex){
                        minindex = j;
                    }
                }
            }
        }

        System.out.println();
        if(minindex == n){
            System.out.println("No repeating element");
            return;
        }

        System.out.println("First Repeating element is : "+" "+arr[minindex]);
    }
}
