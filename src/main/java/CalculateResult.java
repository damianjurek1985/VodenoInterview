public class CalculateResult {
    private double multiplication;
    private double division;
    private int remainder;

    public CalculateResult(double multiplication, double division, int remainder) {
        this.multiplication = multiplication;
        this.division = division;
        this.remainder = remainder;
    }

    public double getMultiplication() {
        return multiplication;
    }

    public double getDivision() {
        return division;
    }

    public int getRemainder() {
        return remainder;
    }
}