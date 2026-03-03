import java.sql.SQLOutput;
import java.util.Scanner;

public class No_Of_Days_In_Month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n<8){
            if(n==2){
                System.out.println("IF LEAP YEAR THEN --> 29 DAYS");
                System.out.println("Not Leap Year Then --> 28 Days");
                return;
            }
            if(n%2==0){
                System.out.println("30 Days");
            }
            else{
                System.out.println("31 DAYS");
            }
        }
        if(n>=8&&n<=12){
            if(n%2==0){
                System.out.println("31 DAYS");
            }
            else{
                System.out.println("30 DAYS");
            }
        }
    }
}
