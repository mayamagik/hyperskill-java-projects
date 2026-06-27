import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int sum_ready = 0;
        int sum_fixed = 0;
        int sum_rejected = 0;

        for (int i = 0; i < n; i++ ){
            int value = scanner.nextInt();

            if (value == 1){
                sum_fixed++;
            }
            if (value == -1){
                sum_rejected++;
            }
            if (value == 0){
                sum_ready++;
            }
        }
        System.out.println(sum_ready + " " + sum_fixed + " " + sum_rejected);

    }
}