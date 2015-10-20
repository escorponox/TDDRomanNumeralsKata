package numerals.roman;

public class RomanNumeralsImpl implements RomanNumerals{

    private ArabicToRomanConverter arabicToRomanConverter;

    public String arabicToRoman(int arabic) {
        arabicToRomanConverter = new ArabicToRomanConverterImpl();
        return arabicToRomanConverter.convert(arabic);
    }

}
