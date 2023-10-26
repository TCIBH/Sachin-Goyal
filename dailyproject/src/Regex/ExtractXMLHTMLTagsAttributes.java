package Regex;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.IOException;
public class ExtractXMLHTMLTagsAttributes{
    public static void main(String[] args)
       throws IOException {
        Path fileName = Path.of("C:\\Users\\HP\\OneDrive\\Desktop\\sachin.html");
        String str = Files.readString(fileName);
        System.out.println(str);
        String[] strPattern = {"<.*?>"};
        for (int i = 0; i < strPattern.length; i++) {
            Pattern pattern
                    = Pattern.compile(strPattern[i]);
            Matcher matcher = pattern.matcher(str);
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        }
    }
}
