package numerals.roman;

public class RomanNumerals {


    public String arabicToRoman(int arabic) {
        if (arabic <= 0)
            return "";
        int remaning = arabic;
        StringBuilder roman = new StringBuilder();

        if (remaning >= 5) {
            roman.append("V");
            remaning -= 5;
        }
        if (remaning >= 4) {
            roman.append("IV");
        } else
            while (remaning > 0) {
                roman.append("I");
                remaning-= 1;
            }
        return roman.toString();
    }
}
