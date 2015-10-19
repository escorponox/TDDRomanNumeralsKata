package numerals.roman;

public class RomanNumeral {
    private final Integer value;
    private final String symbol;

    public RomanNumeral(Integer value, String symbol) {
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
