import java.util.Scanner;
class PrimeNumber_From_1_to_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Prime Numbers from 1 to "+n+" are:-->");
        for(int i =1;i<=n;i++){
            int count = 0;
            for(int j = 1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count == 2){
                System.out.print(i+"\t");
            }
        }
    }
}
