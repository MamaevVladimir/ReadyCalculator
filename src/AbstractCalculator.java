public abstract class AbstractCalculator implements Calculator {

    public void checkNumFromOneToTen(int a, int b) {
        if (a > 10 || a < 1) {
            throw new CalculatorException("Первое введённое число должно быть от 1 до 10!");
        }

        if (b > 10 || b < 1) {
            throw new CalculatorException("Второе введённое число должно быть от 1 до 10!");
        }
    }
}
