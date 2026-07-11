import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();

        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();

        int moment1 = hours1 * 60 * 60 + minutes1 * 60 + seconds1;
        int moment2 = hours2 * 60 * 60 + minutes2 * 60 + seconds2;

        System.out.println(moment2 - moment1 + " seconds");

        String result = transformSeconds(moment2, moment1);
        System.out.println(result);

    }
    static String transformSeconds(int moment2, int moment1){

        int totalSeconds = moment2 - moment1;

        int hours = totalSeconds / 3600;
        int remainingSeconds = totalSeconds % 3600;

        int minutes =  remainingSeconds / 60;
        int seconds =  remainingSeconds % 60;

        return String.format("%d:%02d:%02d", hours, minutes, seconds);

    }
}