package numerals.roman;

public class SymbolValueTable {
    public static final SymbolValue[] SYMBOL_VALUE_TABLE = new SymbolValue[]{
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
}