class Calculator {
    public static CalculateResult calculate(double num1, double num2) {
        if(num2 == 0  ){
            throw  new ArithmeticException("Can not divide by zero.");
        }
        double multiplication = num1 * num2;
        double division = num1 / num2;
        int remainder = (int) (num1 % num2);
        return new CalculateResult(multiplication, division, remainder);
    }
}