package org.example.romannumerals;

public class RomanNumeralService {
    public String convertToRomanNumeral(int input) {
        if (input < 1) {
            System.out.println(input);
            return "Romans did not provide a representation for numbers of less than one";
        }

        String romanNumeral = "";
        int remaining;
        int wholeCounts;

        if(input >= 50) {
            wholeCounts = input / 50;
            remaining = input % 50;
            romanNumeral += (wholeCounts > 0) ? "L".repeat(wholeCounts) : "L";
            input = remaining;
        }

        if(input >= 10) {
            wholeCounts = input / 10;
            remaining = input % 10;
            romanNumeral += (wholeCounts > 0) ? "X".repeat(wholeCounts) : "X";
            input = remaining;
        }

        if(input == 9) {
            romanNumeral += "IX";
            input = 0;
        }

        if(input >= 5) {
            romanNumeral += "V";
            input = input % 5;

        }

        if(input >= 1) {
            romanNumeral += (input == 4) ? "IV" : "I".repeat(input);
        }

        return romanNumeral;
    }
}
