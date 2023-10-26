package Regex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ExtractDatesFromText {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the text and dates in the format\n DD-MM-YYYY\n" +
                "YYYY-MM-DD\n" +
                "DD Month YYYY "+
                "MM/DD/YYYY");
        String str= scan.nextLine();
        //pattern1="((0[1-9]|[1-2][0-9]|3[0-1]\b-0[1-9]|1[1-2]-\\d{4})";
        //pattern2="(\\d{4}-0[1-9]|1[1-2]-0[1-9]|[1-2][0-9]|3[0-1])";
        //patter4="(0[1-9]|1[1-2]/0[1-9]|[1-2][0-9]|3[0-1]/\\d{4})";
        // pattern3="(0[1-9]|[1-2][0-9]|3[0-1]-(January|February|March|April|May|June|July|August|September|October|November|December)-s\\d{4})";
        String[] strPattern={"\\d{2}-\\d{2}-\\d{4}", "[0-9]{2}//[0-9]{2}//[0-9]{4}", "\\d{1,2}-(January|February|March|April|May|June|July|August|September|October|November|December)-\\d{4}", "\\d{4}-\\d{1,2}-\\d{1,2}", "[0-9]{1,2}\\s(January|February|March|April|May|June|July|August|September|October|November|December)\\s\\d{4}", "\\d{1,2}-\\d{1,2}-\\d{4}"};
        for (int i = 0; i < strPattern.length; i++) {
            Pattern pattern = Pattern.compile(strPattern[i]);
            Matcher matcher = pattern.matcher(str);
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        }
    }
}
