import java.util.Scanner;
class Binary_To_Decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int real = n;
        int count = 0;
        int prod = 1;

        int sum= 0;
        while(n>0){

            int dig = n%10;
            for(int i = 0;i<count;i++){
                /*if(count==0){
                    prod = 1;   // count == 0 agr hua bhi to mera loop to chalega nhi nhi kyunki conditon hoga 0<0
                }else{*/
                prod = prod * 2;

            }
            int prod1 = dig * prod;
            sum = sum + prod1;
            count++;
            n=n/10;
            prod = 1;

        }
        System.out.println("Ans"+sum);

    }
}
