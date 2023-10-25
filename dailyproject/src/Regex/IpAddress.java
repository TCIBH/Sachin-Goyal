package Regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class IpAddress {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your ip address");
        String str = scan.nextLine();
        boolean result= Pattern.matches("(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])",str);
    if(result)
        System.out.println("valid ipv4 address");
    else
        System.out.println("invalid ip address");
    }
}
