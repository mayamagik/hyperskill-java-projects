import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int desks1 = (num1 / 2) + (num1 % 2);
        int desks2 = (num2 / 2) + (num2 % 2);
        int desks3 = (num3 / 2) + (num3 % 2);

        System.out.println(desks1 + desks2 + desks3);
    }
}