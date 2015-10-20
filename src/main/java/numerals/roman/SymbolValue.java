package numerals.roman;

public class SymbolValue {
    private final Integer value;
    private final String symbol;

    public SymbolValue(String symbol, Integer value) {
        this.value = value;
        this.symbol = symbol;
    }

    public Integer getValue() {
        return value;
    }

    public String getSymbol() {
        return symbol;
    }
}
