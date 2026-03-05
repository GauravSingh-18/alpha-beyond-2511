import java.util.Scanner;
class Binary_To_Decimal_2nd_Version_Short {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m =n;

        int sum = 0;
        int power = 1;
        while(n>0){
            int dig = n%10;
            sum = sum + (dig*power);
            power = power * 2;
            n = n/10;
        }
        System.out.println("Decimal of binary no -> "+m+" is"+" =>>"+sum);
    }
}
