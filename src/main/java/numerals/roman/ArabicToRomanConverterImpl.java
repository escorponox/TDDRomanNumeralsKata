package numerals.roman;

public class ArabicToRomanConverterImpl implements ArabicToRomanConverter {
    public static final SymbolValue[] ROMAN_NUMERALS = new SymbolValue[]{
            new SymbolValue("M", 1000),
            new SymbolValue("CM", 900),
            new SymbolValue("D", 500),
            new SymbolValue("CD", 400),
            new SymbolValue("C", 100),
            new SymbolValue("XC", 90),
            new SymbolValue("L", 50),
            new SymbolValue("XL", 40),
            new SymbolValue("X", 10),
            new SymbolValue("IX", 9),
            new SymbolValue("V", 5),
            new SymbolValue("IV", 4),
            new SymbolValue("I", 1)
    };
    private final StringBuilder processed = new StringBuilder();
    private int remaning;

    public String convert(int arabic) {
        remaning = arabic;
        for (SymbolValue symbolValue : ROMAN_NUMERALS) {
            process(symbolValue);
        }
        return processed.toString();
    }

    private void process(SymbolValue symbolValue) {
        while (remaning >= symbolValue.getValue()) {
            processed.append(symbolValue.getSymbol());
            remaning -= symbolValue.getValue();
        }
    }
}
