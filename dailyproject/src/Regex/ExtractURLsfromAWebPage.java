package Regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
public class ExtractURLsfromAWebPage {
        public static void main(String[] args)
            throws IOException
            {
                Path fileName = Path.of("C:\\Users\\HP\\OneDrive\\Desktop\\sachin.html");
                String str = Files.readString(fileName);
                System.out.println(str);
            String[] strPattern={"((http|https)://)(www.)?[a-zA-z0-9@:%._\\+~#?&//=]{2,256}\\.[a-z]{2,6}\\b([\s\n]*)"};
                for (int i = 0; i < strPattern.length; i++) {
                    Pattern pattern
                            = Pattern.compile(strPattern[i]);
                    Matcher matcher = pattern.matcher(str);
                    while (matcher.find()) {
                        System.out.println(matcher.group());
            }
        }
    }}
