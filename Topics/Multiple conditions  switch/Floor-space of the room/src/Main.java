import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String shape = scanner.next();

        switch(shape){
            case "triangle":
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                System.out.println(calcTriangle(a,b,c));
                break;

            case "rectangle":
                double d = scanner.nextDouble();
                double e = scanner.nextDouble();
                System.out.println(calcRectangle(d, e));
                break;

            case "circle":
                double radius = scanner.nextDouble();
                System.out.println(calcCircle(radius));
                break;

            default:
                System.out.println("Unknown shape");
        }
    }

    public static double calcTriangle(double a, double b, double c){
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static double calcRectangle(double a, double b){
        return a * b;

    }
    public static double calcCircle(double radius){
        return 3.14 * radius * radius;
    }
}