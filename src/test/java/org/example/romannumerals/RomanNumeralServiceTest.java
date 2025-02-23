package org.example.romannumerals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanNumeralServiceTest {
    private RomanNumeralService romanNumeralService = new RomanNumeralService();

    @ParameterizedTest
    @CsvSource({
            "Romans did not provide a representation for numbers of less than one, -2",
            "Romans did not provide a representation for numbers of less than one, 0",
            "I, 1",
            "II, 2",
            "III, 3",
            "IV, 4",
            "V, 5",
            "VI, 6",
            "VIII, 8",
            "IX, 9",
            "X, 10",
            "XI, 11",
            "XII, 12",
            "XIX, 19",
            "XX, 20",
            "XXI, 21",
            "XXX, 30",
            "XL, 40",
            "L, 50"

    })
    void shouldConvertIntegerToRomanNumeral(String expected, int input) {
        assertEquals(expected, romanNumeralService.convertToRomanNumeral(input));
    }
}
