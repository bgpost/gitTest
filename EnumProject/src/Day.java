import org.apache.commons.lang3.text.WordUtils;

public enum Day {

    MONDAY("Great"), TUESDAY("Even better"), WEDNESDAY("Okay ");

    private String feeling;

    private Day(final String feeling) {
        this.feeling = feeling;
    }

    public String toString() {
        return WordUtils.capitalizeFully(name());
    }
    
    public String message() {
        return "On " + this.toString() + " I feel " + WordUtils.uncapitalize(this.feeling);
    }
}

buggy Change from somewhere