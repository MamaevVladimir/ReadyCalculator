import java.util.HashMap;

public class RomanNumber {
    private static HashMap<String, Integer> numbers = new HashMap<>();

    static {
        numbers.put("-I", -1);
        numbers.put("-II", -2);
        numbers.put("-III", -3);
        numbers.put("-IV", -4);
        numbers.put("-V", -5);
        numbers.put("-VI", -6);
        numbers.put("-VII", -7);
        numbers.put("-VIII", -8);
        numbers.put("-IX", -9);
        numbers.put("-X", -10);

        numbers.put("I", 1);
        numbers.put("II", 2);
        numbers.put("III", 3);
        numbers.put("IV", 4);
        numbers.put("V", 5);
        numbers.put("VI", 6);
        numbers.put("VII", 7);
        numbers.put("VIII", 8);
        numbers.put("IX", 9);
        numbers.put("X", 10);
        numbers.put("XI", 11);
        numbers.put("XII", 12);
        numbers.put("XIII", 13);
        numbers.put("XIV", 14);
        numbers.put("XV", 15);
        numbers.put("XVI", 16);
        numbers.put("XVII", 17);
        numbers.put("XVIII", 18);
        numbers.put("XIX", 19);
        numbers.put("XX", 20);
    }

    public static int convertFromRomanToArabic(String romanNumber) throws CalculatorException {
        if (!numbers.containsKey(romanNumber)) {
            throw new CalculatorException("Введённое значение должно быть числом и в диапазоне от I до X");
        }
        return numbers.get(romanNumber);
    }

    public static String convertFromArabicToRoman(int arabicNumber) throws CalculatorException {

        for (String arabic : numbers.keySet()) {
            if (numbers.get(arabic).equals(arabicNumber)) {
                return arabic;
            }
        }
        return "";
    }

    public static boolean isRomanNumberNoBigThenTen(String number) {
        if (numbers.containsKey(number)) {
            if (number.equals("X")) {
                return true;
            } else if (!number.startsWith("X")) {
                return true;
            }
        }
        return false;
    }
}
