public class CalculatorMain {
    public static void main(String [] args) {

        Calculator calculator = new Calculator() ;

        int sum = calculator.addition(23, 44);
        boolean isGreater = calculator.isGreater(22.0, 43.0);
}
}