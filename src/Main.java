import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Порядок ввода: первое число, пробел, арифметический знак, пробел, второе число. " +
                "Если числа римские, ввод их в верхнем регистре. " +
                "Числа от 1 до 10 включительно, оба числа целые, только арабские или только римские.");

        System.out.println("Input:");

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] parts = input.split(" ");

        if (parts.length != 3) {
            throw new CalculatorException("Вы ввели некорректные данные");
        }

        String firstNumber = parts[0];
        String secondNumber = parts[2];

        Calculator calculator = CalculatorStringUtils.getArabicOrRomanCalculator(firstNumber);
        if (calculator == null) {
            throw new CalculatorException("Вы ввели некорректные данные");
        }

        String action = CalculatorStringUtils.getAction(parts[1]);

        if (action.equals("+")) {
            System.out.println("Output:");
            System.out.println(calculator.add(firstNumber, secondNumber));
        }

        if (action.equals("-")) {
            System.out.println("Output:");
            System.out.println(calculator.sub(firstNumber, secondNumber));
        }

        if (action.equals("/")) {
            System.out.println("Output:");
            System.out.println(calculator.del(firstNumber, secondNumber));
        }

        if (action.equals("*")) {
            System.out.println("Output:");
            System.out.println(calculator.mul(firstNumber, secondNumber));
        }
    }
}
