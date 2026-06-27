import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int max = 0;

        while(num != 0){
            // first use current num
            if (max < num){
                max = num;
            }
            // then use next num
            num = scanner.nextInt();
        }
        System.out.println(max);
    }
}