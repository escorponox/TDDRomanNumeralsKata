package numerals.roman;

public class ArabicToRomanConversion {
    public static final RomanNumeral[] ROMAN_NUMERALS = new RomanNumeral[]{
            new RomanNumeral(9, "IX"),
            new RomanNumeral(5, "V"),
            new RomanNumeral(4, "IV"),
            new RomanNumeral(1, "I")
    };
    private final StringBuilder processed = new StringBuilder();
    private int remaning;

    public ArabicToRomanConversion(int remaning) {
        this.remaning = remaning;
    }

    public String convert() {
        for (RomanNumeral romanNumeral : ROMAN_NUMERALS) {
            process(romanNumeral);
        }
        return processed.toString();
    }

    private void process(RomanNumeral romanNumeral) {
        while (remaning >= romanNumeral.getValue()) {
            processed.append(romanNumeral.getSymbol());
            remaning -= romanNumeral.getValue();
        }
    }
}
