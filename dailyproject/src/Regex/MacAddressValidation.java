package Regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class MacAddressValidation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter A MAC Address ");
        String str = scan.nextLine();
        boolean result= Pattern.matches("^([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})|([0-9a-fA-F]{4}\\.[0-9a-fA-F]{4}\\.[0-9a-fA-F]{4})$",str);
        System.out.println(result);
        if (result)
        {
            System.out.println("valid MAC Address");
        }
        else
        {
            System.out.println("Invalid MAC Address");
        }
    }
}
