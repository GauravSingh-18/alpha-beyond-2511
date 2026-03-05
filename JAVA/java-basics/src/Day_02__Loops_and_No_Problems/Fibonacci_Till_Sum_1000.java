import java.util.Scanner;
class Fibonacci_Till_Sum_1000 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value till which the sum of series exceed n:");
        int n =sc.nextInt();

        int f=0;
        int s=1;
        int sum = 0;

        while(sum<n){
            int next = f+s;
            System.out.print(next+" ");
            f = s;
            s = next;
            sum = sum+next;
        }
    }
}
