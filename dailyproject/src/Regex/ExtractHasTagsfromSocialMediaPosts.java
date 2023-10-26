package Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractHasTagsfromSocialMediaPosts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = scan.nextLine();
        Pattern p = Pattern.compile("(^#\\w+|\\s#\\w+)");
        Matcher m= p.matcher(str);
        List<String> x=new ArrayList<String>();
        while(m.find())
        {
            System.out.println("found a"+m.group() +" . ");
            x.add(m.group());
        }
        System.out.println(" all # in the string is::: "+x);
    }
}
