import java.util.Locale;

import org.apache.commons.lang3.text.WordUtils;

public enum Day {

    MONDAY("Great", Locale.GERMANY), TUESDAY("Even better", Locale.CANADA), WEDNESDAY("Okay ", Locale.US), THURSDAY("like something is missing", Locale.GERMANY), FRIDAY("done", Locale.CHINESE);

    private String feeling;
    private Locale locale;

    private Day(final String feeling, Locale locale) {
        this.feeling = feeling;
        this.locale = locale;
    }

    public String toString() {
        return WordUtils.capitalizeFully(name());
    }
    
    public String message() {
        return "On " + this.toString() + " I feel " + WordUtils.uncapitalize(this.feeling);
    }
    
    public String language() {
        return locale.getLanguage();
    }
}
