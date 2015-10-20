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

    private void arabicToRomanEquals(String roman, Integer arabic) {
        assertEquals(roman, romanNumerals.arabicToRoman(arabic));
    }

    private void romanToArabicEquals(Integer arabic, String roman) {
        assertEquals(arabic, Integer.valueOf(romanNumerals.romanToArabic(roman)));
    }

    @Test
    public void arabicToRomanSuite() throws Exception {
        arabicToRomanEquals("", 0);
        arabicToRomanEquals("I", 1);
        arabicToRomanEquals("II", 2);
        arabicToRomanEquals("III", 3);
        arabicToRomanEquals("IV", 4);
        arabicToRomanEquals("V", 5);
        arabicToRomanEquals("VI", 6);
        arabicToRomanEquals("VII", 7);
        arabicToRomanEquals("VIII", 8);
        arabicToRomanEquals("IX", 9);
        arabicToRomanEquals("X", 10);
        arabicToRomanEquals("XL", 40);
        arabicToRomanEquals("L", 50);
        arabicToRomanEquals("XC", 90);
        arabicToRomanEquals("C", 100);
        arabicToRomanEquals("CD", 400);
        arabicToRomanEquals("D", 500);
        arabicToRomanEquals("CM", 900);
        arabicToRomanEquals("M", 1000);
        arabicToRomanEquals("MCMXCIX", 1999);
    }

    @Test
    public void romanToArabic() throws Exception {
        romanToArabicEquals(1000, "M");
        romanToArabicEquals(900, "CM");
        romanToArabicEquals(500, "D");
        romanToArabicEquals(400, "CD");
        romanToArabicEquals(100, "C");
        romanToArabicEquals(90, "XC");
        romanToArabicEquals(50, "L");
        romanToArabicEquals(40, "XL");
        romanToArabicEquals(10, "X");
        romanToArabicEquals(9, "IX");
        romanToArabicEquals(5, "V");
        romanToArabicEquals(4, "IV");
        romanToArabicEquals(1, "I");
        romanToArabicEquals(0, "");
        romanToArabicEquals(1999, "MCMXCIX");
    }
}
