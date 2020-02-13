public interface Calculator {

    String add(String a, String b) throws CalculatorException;

    String sub(String a, String b) throws CalculatorException;

    String del(String a, String b) throws CalculatorException;

    String mul(String a, String b) throws CalculatorException;
}
