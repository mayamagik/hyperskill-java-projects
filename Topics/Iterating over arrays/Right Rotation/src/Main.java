import java.util.Scanner;
import java.util.Arrays;

class Main {
    // implement me
    private static void rotate(int[] arr, int steps) {
        steps = steps % arr.length; // it reduces multiple rotations when step is a large no.

        for (int i = 0; i < steps; i++){ // executes no. of rotations
            int last = arr[arr.length - 1]; // store last element temporarily

            for( int j = arr.length -1; j > 0; j--){ // executes movement from last to right
                arr[j] = arr[j -1];
            }
            arr[0] = last; // copy last element to first element
        }


    }

    // do not change code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int steps = Integer.parseInt(scanner.nextLine());

        rotate(arr, steps);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}