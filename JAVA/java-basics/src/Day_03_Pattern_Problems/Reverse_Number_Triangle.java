package Day_03_Pattern_Problems;
import java.util.Scanner;
class Reverse_Number_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i =n;i>=1;i--){
            for(int j = 1;j<=n-i+1;j++){
                System.out.print(n-j+1);
            }
            System.out.println();
        }
        /*for(int i =n;i>=1;i--){
            for(int j = n-i+1;j>=1;j--){
                System.out.print(n - (n - i + 1 - j));   print karane me logic bnane mein maautt aa jaayegi
            }
            System.out.println();
        }*/
    }
}
