package Day_03_Pattern_Problems;
import java.util.Scanner;
class Hollow_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length");
        int l = sc.nextInt();
        System.out.println("enter breadth");
        int b = sc.nextInt();

        for(int i = 1;i<=l;i++){
            for(int j = 1;j<=b;j++){
                if(i==l||i==1||j==1||j==b){
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
    }
}
