import java.util.Scanner;
class Largest_Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      //  int dig = 0;
        int larg=0;
        while(n>0){
            int dig = n%10;
            if(dig>larg){
                larg = dig;
            }
            n = n/10;
        }
        System.out.println("Largest Digit is:"+larg);
    }
}

