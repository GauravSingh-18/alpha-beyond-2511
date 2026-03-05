import java.util.Scanner;
class Decimal_To_Binary {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the decimal number:");
        int n = sc.nextInt();

        System.out.println("The Binary of "+n+" is:-->");
        while(n>0){
            int bin = n%2;
            n= n/2;
            System.out.print(bin);
        }
    }
}

