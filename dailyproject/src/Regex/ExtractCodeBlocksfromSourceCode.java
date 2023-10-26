package Regex;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCodeBlocksfromSourceCode {
    public static void main(String[] args)
            throws IOException {
        Path fileName = Path.of("C:\\Users\\HP\\OneDrive\\Desktop\\sachin.html");
        String str = Files.readString(fileName);
        //System.out.println(str);
        String[] strPattern = {"public|private|static|protected|abstract|native|synchronized +[a-zA-Z0-9<>._?, ]* +[a-zA-Z0-9_]+ *\\\\[a-zA-Z0-9<>\\\\[\\\\]._?, \\n]*\\\\ *[a-zA-Z0-9_ ,\\n]* *\\{" };
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
