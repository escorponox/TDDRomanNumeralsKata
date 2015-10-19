package numerals.roman;

public class ArabicToRomanConversion {
    public static final RomanNumeral[] ROMAN_NUMERALS = new RomanNumeral[]{
            new RomanNumeral(5, "V"),
            new RomanNumeral(4, "IV"),
            new RomanNumeral(1, "I")
    };
    private final StringBuilder processed = new StringBuilder();
    private int remaning;

    public ArabicToRomanConversion(int remaning) {
        this.remaning = remaning;
    }

    public StringBuilder getProcessed() {
        return processed;
    }

    public int getRemaning() {
        return remaning;
    }

    public void setRemaning(int remaning) {
        this.remaning = remaning;
    }

    String convert() {
        for (RomanNumeral romanNumeral : ROMAN_NUMERALS) {
            process(romanNumeral);
        }
        return getProcessed().toString();
    }

    private void process(RomanNumeral romanNumeral) {
        while (getRemaning() >= romanNumeral.getValue()) {
            getProcessed().append(romanNumeral.getSymbol());
            setRemaning(getRemaning() - romanNumeral.getValue());
        }
    }
}
