import java.util.Scanner;
class GreatestOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        if(n1==n2&&n2==n3){
            System.out.println("All numbers are same");
        }

        if(n1>=n2&&n1>=n3){
            System.out.println("Greatest is :- "+n1);
        }
        else if(n2>n3){
            System.out.println("Greatest is:- "+n2);
        }
        else{
            System.out.println("Greatest is :- "+n3);
        }
    }
}
