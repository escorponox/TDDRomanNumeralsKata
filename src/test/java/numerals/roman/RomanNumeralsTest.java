package numerals.roman;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralsTest {

    private RomanNumerals romanNumerals;

    @Before
    public void setUp() {
        romanNumerals = new RomanNumeralsImpl();
    }

    private void arabicToRomanEquals(Integer arabic, String roman) {
        assertEquals(roman, romanNumerals.arabicToRoman(arabic));
    }

    @Test
    public void arabicToRomanSuite() throws Exception {
        arabicToRomanEquals(0, "");
        arabicToRomanEquals(1, "I");
        arabicToRomanEquals(2, "II");
        arabicToRomanEquals(3, "III");
        arabicToRomanEquals(4, "IV");
        arabicToRomanEquals(5, "V");
        arabicToRomanEquals(6, "VI");
        arabicToRomanEquals(7, "VII");
        arabicToRomanEquals(8, "VIII");
        arabicToRomanEquals(9, "IX");
        arabicToRomanEquals(10, "X");
        arabicToRomanEquals(40, "XL");
        arabicToRomanEquals(50, "L");
        arabicToRomanEquals(90, "XC");
        arabicToRomanEquals(100, "C");
        arabicToRomanEquals(400, "CD");
        arabicToRomanEquals(500, "D");
        arabicToRomanEquals(900, "CM");
        arabicToRomanEquals(1000, "M");
        arabicToRomanEquals(1999, "MCMXCIX");
    }
}
