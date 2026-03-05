// Perfect Number = sum of proper divisors equals the number itself
// i.e --> 6 = 1 + 2 + 3

import java.util.Scanner;
class PERFECT_NUMBERS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=1){
            System.out.println("Not Perfect Number");
            return;
        }
        int sum = 0;
        for(int i = 1;i<=n/2;i++){
            if(n%i==0){
                sum = sum + i;
            }
        }
        if(sum==n){
            System.out.println("Perfect Number");
        }
        else{
            System.out.println("Not Perfect Number");
        }
    }
}
