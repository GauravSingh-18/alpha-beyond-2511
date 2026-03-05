

import java.util.Scanner;
class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first = 0;
        int second = 1;

        for(int i = 1;i<=n;i++){
            int next = first+second;
            System.out.print(first+" ");
            first=second;
            second = next;
        }


    }
}
