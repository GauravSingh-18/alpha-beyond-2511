import java.util.Scanner;
class Check_Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int n = ch;
        if((n>=65 && n<=90)||(n>=97 && n<=122)){
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                System.out.println("Vowel");
            }
            else{
                System.out.println("Consonant");
            }
        }

        else if(n>=48&&n<=57){
            System.out.println("Digit");
        }
        else{
            System.out.println("Special");
        }
    }
}
