package udemy.classdesign.testing;

public class Complex {

    private final double real;
    private final double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal(){
        return real;
    }

    public double getImaginary(){
        return imaginary;
    }

    public Complex plus(Complex other){
        double newReal = real + other.real;
        double newImaginary = imaginary + other.imaginary;
        return new Complex(newReal, newImaginary);
    }

    public Complex minus(Complex other) {
        double newReal = real - other.real;
        double newImaginary = imaginary - other.imaginary;
        return new Complex(newReal, newImaginary);
    }

    public Complex times(Complex other) {
        double newReal = real * other.real - imaginary * other.imaginary;
        double newImaginary = real * other.imaginary + imaginary * other.real;
        return new Complex(newReal, newImaginary);
    }

    public static Complex plus(Complex a, Complex b){
        //double real = a.real + b.real;
        //double imaginary = a.imaginary + b.imaginary;
        //return new Complex(real, imaginary);
        return a.plus(b);
    }

    public static void main(String[] args) {
        Complex a = new Complex(5.0, 6.0);
        Complex b = new Complex(-3.0, 4.0);

        Complex bPlusA = Complex.plus(a, b);

        System.out.println("a real = " + a.real + " a imaginary = " + a.imaginary);
        System.out.println("b real = " + b.real + " b imaginary = " + b.imaginary);
        System.out.println("bPlusA real = " + bPlusA.real + " bPlusA imaginary = " + bPlusA.imaginary);
    }
}
