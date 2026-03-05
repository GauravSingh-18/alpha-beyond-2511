import java.util.Scanner;
class Character_Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int n = ch;
        if(n >=65&&n <=90){
            System.out.println("Uppercase");
        }
        else if(n>=97&& n<=122){
            System.out.println("LowerCase");
        }
        else if(n>=48&&n <= 57){
            System.out.println("Digit");
        }
        else{
            System.out.println("Special");
        }

    }
}
