import java.util.Scanner;
class Armstrong_Without_Function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<0){
            System.out.println("Negative Numbers are not Armstrong NUmber");
            return;
        }
        int real = n;
        int count =0;
        while(n>0){
            n=n/10;
            count++;
        }

        n = real;
        int mult = 1;
        int sum = 0;
        while(n>0){
            int dig = n%10;
            for(int i = 1;i<=count;i++){
                mult = mult*dig;
            }
            sum = sum + mult;
            n= n/10;
            mult = 1;
        }
        if(sum==real){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not Armstrong Number");
        }
    }
}
