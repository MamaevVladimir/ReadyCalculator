public class CalculatorRoman extends AbstractCalculator {

    @Override
    public String add(String a, String b) throws CalculatorException {
        int num1 = RomanNumber.convertFromRomanToArabic(a);
        int num2 = RomanNumber.convertFromRomanToArabic(b);
        checkNumFromOneToTen(num1, num2);
        int result = num1 + num2;
        return RomanNumber.convertFromArabicToRoman(result);
    }

    @Override
    public String sub(String a, String b) throws CalculatorException {
        int num1 = RomanNumber.convertFromRomanToArabic(a);
        int num2 = RomanNumber.convertFromRomanToArabic(b);
        checkNumFromOneToTen(num1, num2);
        int result = num1 - num2;
        return RomanNumber.convertFromArabicToRoman(result);
    }

    @Override
    public String del(String a, String b) throws CalculatorException {
        int num1 = RomanNumber.convertFromRomanToArabic(a);
        int num2 = RomanNumber.convertFromRomanToArabic(b);
        checkNumFromOneToTen(num1, num2);
        int result = num1 / num2;
        return RomanNumber.convertFromArabicToRoman(result);
    }

    @Override
    public String mul(String a, String b) throws CalculatorException {
        int num1 = RomanNumber.convertFromRomanToArabic(a);
        int num2 = RomanNumber.convertFromRomanToArabic(b);
        checkNumFromOneToTen(num1, num2);
        int result = num1 * num2;
        return RomanNumber.convertFromArabicToRoman(result);
    }
}
