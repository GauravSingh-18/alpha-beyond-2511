package Day_03_Pattern_Problems;
import java.util.Scanner;
class Inverted_Right_Half_Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1;i<=n;i++){
            for(int j =i-1;j>=1;j--){
                System.out.print(" ");
            }
            for(int k = n-(i-1);k>=1;k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
