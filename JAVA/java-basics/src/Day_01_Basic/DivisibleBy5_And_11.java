import java.util.Scanner;
class DivisibleBy5_And_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        if(n%5==0&&n%11==0){
            System.out.println("Number is divisible by 5 and 11 :"+" "+n);
        }
        else{
            System.out.println("NOOOOOO");
        }
    }
}
