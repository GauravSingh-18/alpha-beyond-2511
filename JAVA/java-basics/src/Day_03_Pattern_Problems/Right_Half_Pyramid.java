package Day_03_Pattern_Problems;
import java.util.Scanner;
class Right_Half_Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n-i;j++){
                System.out.print(" ");     // System.out.print(" "+" ");
            }
            for(int k = 1;k<=i;k++){
                System.out.print("*");     // System.out.print(" " + "*"); for better picture
            }
            System.out.println();
        }
    }
}
