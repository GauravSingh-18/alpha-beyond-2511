import java.util.Scanner;
class GreatestOf3 {
    public static void main(String[]   args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        if(n1==n2&&n2==n3){
            System.out.println("All numbers are same");
            return;
        }


        if(n1>=n2&&n1>=n3){
            System.out.println("N1 is greatest"+ n1);
        }
        else if(n2>=n3&&n2>=n1){
            System.out.println("N2 is greatest"+n2);
        }
        else{
            System.out.println("N3 is the greatest"+n3);
        }
    }
}
