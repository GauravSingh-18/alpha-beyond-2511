//STRONG NO. = a no. whose sum of factorial of digits equal the no.
//   i.e-->  145 == 1! + 4! + 5!
import java.util.Scanner;
class STRONG_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int real = n;
        int sum = 0;
        while(n>0){
            int dig = n%10;
            int fact = 1;
            for(int i =1;i<=dig;i++){
                fact = fact * i;
            }
            sum = sum +fact;
            fact = 1;
            n=n/10;

        }
        if(sum==real){
            System.out.println("STRONG NUMBER");
        }
        else{
            System.out.println("Not Strong Number");
        }
    }
}
