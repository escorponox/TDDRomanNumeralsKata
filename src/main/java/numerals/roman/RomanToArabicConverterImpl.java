package numerals.roman;

public class RomanToArabicConverterImpl implements RomanToArabicConverter {

    private int arabic = 0;
    private int index = 0;

    public int convert(String roman) {
        for (SymbolValue symbolValue : SymbolValueTable.SYMBOL_VALUE_TABLE) {
            process(roman, symbolValue);
        }
        return arabic;
    }

    private void process(String roman, SymbolValue symbolValue) {
        while (actualSymbolNotProcessed(roman, symbolValue)) {
            arabic += symbolValue.getValue();
            index += symbolValue.getSymbol().length();
        }
    }

    private boolean actualSymbolNotProcessed(String roman, SymbolValue symbolValue) {
        return roman.indexOf(symbolValue.getSymbol(), index) == index;
    }
}
