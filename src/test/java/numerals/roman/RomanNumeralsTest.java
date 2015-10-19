package numerals.roman;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralsTest {

    private RomanNumerals romanNumerals;

    @Before
    public void setUp() {

        romanNumerals = new RomanNumerals();
    }

    private void equals(Integer arabic, String roman) {
        assertEquals(roman, romanNumerals.arabicToRoman(arabic));
    }

    @Test
    public void facts() throws Exception {
        equals(0, "");
        equals(1, "I");
        equals(2, "II");
        equals(3, "III");
        equals(4, "IV");
        equals(5, "V");
        equals(6, "VI");
        equals(7, "VII");
        equals(8, "VIII");
        equals(9, "IX");
    }
}
