public class ComplexNumber extends RealNumber {
    public double imaginaryValue;

    public ComplexNumber() {
        this(1.0, 1.0);
    }

    public ComplexNumber(double realValue, double imaginaryValue) {
        super(realValue);
        this.imaginaryValue = imaginaryValue;
    }

    public String toString() {
        return super.toString() + "\nImaginaryPart: " + imaginaryValue;
    }
    
}