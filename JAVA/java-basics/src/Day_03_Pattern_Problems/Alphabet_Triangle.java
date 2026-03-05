package Day_03_Pattern_Problems;
import java.util.Scanner;
class Alphabet_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i =1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                char ch = (char)('A'+count);
                System.out.print(ch+" ");
                count++;
            }
            System.out.println();
        }
    }
}
