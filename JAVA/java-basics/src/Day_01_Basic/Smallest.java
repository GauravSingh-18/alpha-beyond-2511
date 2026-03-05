import java.util.Scanner;
class Smallest {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int small = n1;

        if(n2<small){
            small = n2;
        }
        if(n3<small){
            small =n3;
        }
        System.out.println("Smallest is;"+small);
    }
}
