// GCD = Greatest Common Divisor
// the largest number that divides both the number

import java.util.Scanner;
class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int n1 = sc.nextInt();
        System.out.println("Enter the 2nd number");
        int n2 = sc.nextInt();
        int m;
        if(n1==0||n2==0){
            if(n1>n2){
                System.out.println("G.C.D IS:-->"+" "+n1);
            }
            else{
                System.out.println("G.C.D IS:-->"+" "+n2);
            }
        }
        if(n1>n2){
            m=n2;
        }
        else{
            m=n1;
        }

        for(int i = m; i>=1;i--){
            if(n1%i==0&&n2%i==0){
                System.out.println("G.C.D IS"+" "+i);
                return;
            }
        }
    }
}
