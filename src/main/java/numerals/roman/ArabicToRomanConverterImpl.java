package numerals.roman;

public class ArabicToRomanConverterImpl implements ArabicToRomanConverter {
    private final StringBuilder processed = new StringBuilder();
    private int remaning;

    public String convert(int arabic) {
        remaning = arabic;
        for (SymbolValue symbolValue : SymbolValueTable.SYMBOL_VALUE_TABLE) {
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
