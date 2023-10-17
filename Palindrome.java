import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name fow which you want to find that it is palindrome or not!...");
        String str = scan.nextLine();
        int j = str.length() - 1;
        for (int i = 0; i < j; i++)
            if (str.charAt(i) != str.charAt(j)) {
                System.out.println("NOT PALINDROME...");

                break;

            } else {
                System.out.println("PALIDROME..");
                break ;

            }
    }
}
