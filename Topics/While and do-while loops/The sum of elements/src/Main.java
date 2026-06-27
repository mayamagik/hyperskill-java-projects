import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int sum = 0;

        while (num != 0){
            sum+= num; // first n is read outside the loop -> sum is calculated first in the loop
            num = scanner.nextInt();
        }
    System.out.println(sum);
    }
}