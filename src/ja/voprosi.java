package ja;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;

//
public class voprosi {

    public static void main(String[] args) throws IOException {
        String country = "", language = "";
        System.out.println("1 – Эстонский язык");
        System.out.println("2 – Латышский язык");
        System.out.println("3 – Финский язык");
        System.out.println("4 – Французский язык");
        char i = (char) System.in.read();
        switch (i) {
            case '1':
                language = "et";
                country = "ET";
                break;
            case '2':
                language = "lv";
                country = "LV";
                break;
            case '3':
                language = "fi";
                country = "FI";
                break;
            case '4':
                language = "fr";
                country = "FR";
                break;

        }
        ResourceBundle rb = ResourceBundle.getBundle("question", new Locale(language, country));
        System.out.println(getStr(rb.getString("my.question"), rb.getString("utf16")));
        System.out.println(getStr(rb.getString("my.reply"), rb.getString("utf16")));

        System.out.println(getStr(rb.getString("my.question2"), rb.getString("utf16")));
        System.out.println(getStr(rb.getString("my.reply2"), rb.getString("utf16")));

        System.out.println(getStr(rb.getString("my.question3"), rb.getString("utf16")));
        System.out.println(getStr(rb.getString("my.reply3"), rb.getString("utf16")));
        
        
    }

    public static String getStr(String question, String utf16) throws UnsupportedEncodingException {
        if (!utf16.equals("true")) {
            return new String(question.getBytes("ISO-8859-1"), "Windows-1251");
        } else {
            return question;
        }
    }

}
