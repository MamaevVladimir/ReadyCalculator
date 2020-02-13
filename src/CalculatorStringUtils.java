public class CalculatorStringUtils {

    public static Calculator getArabicOrRomanCalculator(String firstNumber) {
        if (firstNumber.equals("1") ||
                firstNumber.equals("2") ||
                firstNumber.equals("3") ||
                firstNumber.equals("4") ||
                firstNumber.equals("5") ||
                firstNumber.equals("6") ||
                firstNumber.equals("7") ||
                firstNumber.equals("8") ||
                firstNumber.equals("9") ||
                firstNumber.equals("10")
        ) {
            return new CalculatorArabic();
        }

        if (firstNumber.equals("I") ||
                firstNumber.equals("II") ||
                firstNumber.equals("III") ||
                firstNumber.equals("IV") ||
                firstNumber.equals("V") ||
                firstNumber.equals("VI") ||
                firstNumber.equals("VII") ||
                firstNumber.equals("VIII") ||
                firstNumber.equals("IX") ||
                firstNumber.equals("X")) {
            return new CalculatorRoman();
        }
        return null;
    }

    public static String getAction(String text) throws CalculatorException {
        if (!text.equals("/") && !text.equals("*") && !text.equals("+") && !text.equals("-")) {
            throw new CalculatorException("Некорректная операция!");
        }
        return text;
    }
}
