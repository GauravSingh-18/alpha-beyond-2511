import java.util.Scanner;
class Frequeny_Of_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n;
        int p = n;

        while(n>0){
            int dig = n%10;
            int count = 0;
            while(m>0){
                int dig1 = m%10;
                if(dig == dig1){
                    count++;
                }
                m = m/10;
            }
            m=p;
            n=n/10;
            if(count>1){
                System.out.println("Digit ->"+" "+dig+" occurs --->"+" "+count+" times");
            }
            else{
                System.out.println("Digit ->"+" "+dig+" occurs ---> 1 times");
            }
            count = 0;
        }
    }
}
