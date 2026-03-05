package Day_03_Pattern_Problems;
import java.util.Scanner;
class Hollow_Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1;i<=n;i++){
            for(int j =1;j<=n-i;j++){
                System.out.print(" "+" ");
            }
            for(int k =1;k<=(2*i)-1;k++){
                if(i!=n){
                    if(k==1||k==2*i-1){
                        System.out.print("*"+" ");
                    }
                    else{
                        System.out.print(" "+" ");
                    }
                }
                else{
                    System.out.print("*"+" ");
                }

            }
            System.out.println();
        }
    }
}
