package Regex;
import java.util.Scanner;
import java.util.regex.Pattern;
public class ValidationUUid {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter A UUID NUMBER");
            String str = scan.nextLine();
            boolean result= Pattern.matches("^[0-9A-Fa-f]{8}\b-[0-9A-Fa-f]{4}\b-[0-9A-Fa-f]{4}\b-[0-9A-Fa-f]{4}\b-[0-9A-Fa-f]{12}$",str);
            System.out.println(result);
            if (result)
            {
                System.out.println("valid UUID Number");
            }
            else
            {
                System.out.println("Invalid UUID Number");
            }
        }
    }


