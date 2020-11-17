package ja;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class VSE {

    public static void main(String[] args) {

        Locale[] locales = new Locale[]{Locale.ENGLISH,
            new Locale("et", "ET"),
            new Locale("lv", "LV"),
            new Locale("fi", "FI"),
            new Locale("sr", "SR"),
            new Locale("fr", "FR"),};

        for (Locale locale : locales) {
            NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);
            System.out.println("Валюта: " + locale.getDisplayName() + " = " + "   "
                    + currencyFormat.format(100));
        }
        System.out.println();
        for (Locale locale : locales) {
            System.out.println("Short date format in " + locale.getDisplayName() + " = "
                    + SimpleDateFormat.getDateInstance(SimpleDateFormat.SHORT, locale).format(new Date()));
        }

        System.out.println();
        for (Locale locale : locales) {
            System.out.println("Full date format in " + locale.getDisplayName() + " = "
                    + SimpleDateFormat.getDateInstance(SimpleDateFormat.FULL, locale).format(new Date()));
        }

        System.out.println();
        for (Locale locale : locales) {
            System.out.println("Short time format in " + locale.getDisplayName() + " = "
                    + SimpleDateFormat.getTimeInstance(SimpleDateFormat.SHORT, locale).format(new Date()));
        }

        System.out.println();
        for (Locale locale : locales) {
            System.out.println("Full time format in " + locale.getDisplayName() + " = "
                    + SimpleDateFormat.getTimeInstance(SimpleDateFormat.FULL, locale).format(new Date()));
        }

    }
}
