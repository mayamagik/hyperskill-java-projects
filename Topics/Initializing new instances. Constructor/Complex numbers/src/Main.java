class Complex{
    double real;
    double imaginary;

    Complex(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;

    }

}
public class Main{
    public static void main(String[] args) {
        Complex num1 = new Complex(33.4, 45.6);
        System.out.println(num1.real);
        System.out.println(num1.imaginary);

    }
}

