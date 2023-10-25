package Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UrlValidation {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the url::");
        String str=scan.nextLine();
        Pattern p=Pattern.compile(" ((http|https)://)(www.)?[a-zA-z0-9@:%._\\+~#?&//=]{2,256}\\.[a-z]{2,6}\\b([\s\n]*)",Pattern.CASE_INSENSITIVE);
        Matcher m= p.matcher(str);
        List<String> x=new ArrayList<String>();
        while(m.find())
        {
            x.add(m.group());
        }
        if(x.isEmpty())
        {
            System.out.println("enter a  url");
        }
        else {
        System.out.println(x);
        }

    }
}
