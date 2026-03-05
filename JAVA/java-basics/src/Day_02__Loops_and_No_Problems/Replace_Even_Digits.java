import java.util.Scanner;
class Replace_Even_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int real = n;
        int original = n;
        int o = n;
        int temp = 0;
        int rev = 0;
        while(n>0){
            int dig = n%10;
            if(dig%2==0){
                temp = temp * 10 + dig;
            }
            rev = rev*10+dig;
            n=n/10;
        }
        int res = 0;
        int temp1 = temp;

        while(real>0){
            int dig1 = real%10;
            if(dig1%2==0){
                dig1=temp1%10;
                temp1 = temp1/10;
            }
            res = res*10 + dig1;
            real = real/10;

        }
        int rev3 =0;
        while(res>0){
            int dig2 = res%10;
            rev3 =rev3 * 10  + dig2;
            res = res/10;

        }

      //  System.out.println(temp+" "+rev+" "+res);
        System.out.println("Original number is:- "+ o);
        System.out.println("Even digits replaced Number is:->>"+rev3);
    }
}
