package Day_03_Pattern_Problems;
import java.util.Scanner;
class Butterfly_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1;i<=n;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*"+" ");
            }
            for (int k = 1; k <= (n * 2) - (2 * i); k++) {
                System.out.print(" "+" ");
            }
            for(int l = 1;l<=i;l++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        // inverted part
        for(int i =n;i>=1;i--){
            for(int j =1;j<=i;j++){
                System.out.print("*"+" ");
            }
            for(int k =(n * 2) - (2 * i);k>=1;k--){
                System.out.print(" "+" ");
            }
            for(int l = 1;l<=i;l++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

    }
}
