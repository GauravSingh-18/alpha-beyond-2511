import java.util.Scanner;
class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cop = n;
        int rev = 0;

        while(n>0){
            int dig = n%10;
            n = n/10;
            rev = (rev*10) + dig;
        }
        if(rev==cop){
            System.out.println("PALINDROME");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
