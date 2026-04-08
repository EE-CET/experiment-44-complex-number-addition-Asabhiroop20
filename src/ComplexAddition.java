import java.util.Scanner;

class Complex {
    int real;
    int imag;

    // Constructor
    Complex(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }

    // Add method (correct place)
    Complex add(Complex c) {
        int newReal = this.real + c.real;
        int newImag = this.imag + c.imag;
        return new Complex(newReal, newImag);
    }
}

public class ComplexAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r1 = sc.nextInt();
        int i1 = sc.nextInt();
        int r2 = sc.nextInt();
        int i2 = sc.nextInt();

        Complex c1 = new Complex(r1, i1);
        Complex c2 = new Complex(r2, i2);

        Complex result = c1.add(c2);

        System.out.print(result.real + " + " + result.imag + "i");
    }
}