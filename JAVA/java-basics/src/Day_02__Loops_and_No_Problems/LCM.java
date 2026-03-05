import java.util.Scanner;
class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number:");
        int n1 = sc.nextInt();
        System.out.println("Enter the 2nd number");
        int n2 = sc.nextInt();
        int m;
        if(n1==0||n2==0){
            System.out.println("The L.C.M of "+n1+" and"+n2+" is:--> 0");
        }
        if(n1>n2){
            m = n1;
        }
        else{
            m = n2;
        }

        for(int i = m;i<=n1*n2;i++){
            if(i%n1==0&&i%n2==0){
                System.out.println("The L.C.M of "+n1+" and"+n2+" is:-->"+" "+i);
                return;
            }
        }

    }
}
