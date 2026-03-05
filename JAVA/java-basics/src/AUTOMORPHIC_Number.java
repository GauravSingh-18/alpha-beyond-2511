// AUTOMORPHIC NO. = number whose square ends with the number itself
// i.e--> 5 = sqr of 5 =25
// i.e--> 25 = sqr of 25 = 125

import java.util.Scanner;
class AUTOMORPHIC_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       /* int m = n;
        int num = n;
        int count = 0;
        while(n>0){
            n=n/10;
            count++;
        }

        int sqr = num * num;
        int c =0;
        int p = 0;
        for(int i  = sqr;i>=0;i=i/10){
            int digs = i%10;
            int dig=0;
            while(num>0){
                dig = num%10;
                num = num/10;
            }
            num = m;
            if(digs==dig){
                c++;
            }
            p++;
            if(p==count){
                break;
            }

        }
        if(c==count){
            System.out.println("autiff");
        }*/

        if(n<0){
            System.out.println("NOTT Automorphic Number");
            return;
        }
        if(n==0){
            System.out.println("Automorphic Number");
        }
        int sqr = n*n;
        int real = n;
        int digits = 0;
        while(n>0){
            n=n/10;
            digits++;
        }
        int prd = 1;
        for(int i = 1;i<=digits;i++){
            prd = prd * 10;
        }
        if(sqr%prd==real){
            System.out.println("Automorphic Number");
        }
        else{
            System.out.println("NOTT Automorphic Number");
        }


    }
}
