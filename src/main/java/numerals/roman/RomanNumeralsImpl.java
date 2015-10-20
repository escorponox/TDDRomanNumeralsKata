package numerals.roman;

public class RomanNumeralsImpl implements RomanNumerals{

    private ArabicToRomanConverter arabicToRomanConverter;
    private RomanToArabicConverter romanToArabicConverter;

    public String arabicToRoman(int arabic) {
        arabicToRomanConverter = new ArabicToRomanConverterImpl();
        return arabicToRomanConverter.convert(arabic);
    }

    public int romanToArabic(String roman) {
        romanToArabicConverter = new RomanToArabicConverterImpl();
        return romanToArabicConverter.convert(roman);
    }
}
