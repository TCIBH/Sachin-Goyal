package Regex;

import java.util.Scanner;

public class HtmlTagRemoval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a html tag");
        String str = scan.nextLine();
        str = str.replaceAll("<.*?>","");
        System.out.println(str);
    }
}