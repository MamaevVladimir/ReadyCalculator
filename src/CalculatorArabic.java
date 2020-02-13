public class CalculatorArabic extends AbstractCalculator {

    @Override
    public String add(String a, String b) throws CalculatorException, NumberFormatException {
        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);
        checkNumFromOneToTen(num1, num2);
        return (num1 + num2) + "";
    }

    @Override
    public String sub(String a, String b) throws CalculatorException, NumberFormatException {
        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);
        checkNumFromOneToTen(num1, num2);
        return (num1 - num2) + "";
    }

    @Override
    public String del(String a, String b) throws CalculatorException, NumberFormatException {
        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);
        checkNumFromOneToTen(num1, num2);
        return (num1 / (double) num2) + "";
    }

    @Override
    public String mul(String a, String b) throws CalculatorException, NumberFormatException {
        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);
        checkNumFromOneToTen(num1, num2);
        return (num1 * num2) + "";
    }
}
