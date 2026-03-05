import java.util.Scanner;

class Armstrong_PowerFncn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<0){
            System.out.println("Negative Numbers are not Armstrong Number");
            return;
        }
        int original = n;
        int m = n;
        int count = 0;
        while(n>0){
            n=n/10;
            count++;
        }

        int sum = 0;


        while(m>0){
            int dig = m%10;
            sum = (int)(sum + Math.pow(dig,count));

            m = m/10;

        }

        if(sum == original){
            System.out.println("ARMSTRONG NUMBER");
        }
        else{
            System.out.println("NOT ARMSTRONG NUMBER");
        }

    }
}
