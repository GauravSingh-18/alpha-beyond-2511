import java.util.Scanner;
class GreatestOf3_2ndVersion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int greatest = n1;
        if (n2>greatest){
            greatest=n2;
        }
        if(n3>greatest){
            greatest =n3;
        }
        System.out.println("Greatest is:- "+greatest);

    }
}
