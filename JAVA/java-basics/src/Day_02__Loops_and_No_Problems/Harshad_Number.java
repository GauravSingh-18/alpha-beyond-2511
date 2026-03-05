// HARSHAD NO. = if the number is divisible by sum of it'd digit
// i.e--> 18 = 1+8 = 9 && 18 is divisible by 9

import java.util.Scanner;
class Harshad_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int real = n;
        int sum = 0;
        if(n == 0){
            System.out.println("HARSHAD NUMBER");
            return;
        }
        while(real>0){
            sum = sum + (real%10);
            real = real/10;
        }
        if(n%sum==0){
            System.out.println("HARSHAD NUMBER");
        }
        else{
            System.out.println("NOTT HARSHAD NUMBER");
        }
    }
}
