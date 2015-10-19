package numerals.roman;

public class RomanNumerals {


    public String arabicToRoman(int arabic) {
        if (arabic <= 0)
            return "";
        return new ArabicToRomanConversion(arabic).convert();
    }

}
