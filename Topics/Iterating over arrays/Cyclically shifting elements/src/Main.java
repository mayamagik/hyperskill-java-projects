import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }

        int last = arr[arr.length-1];

            for(int j = arr.length -1; j > 0; j--){
                arr[j] = arr[j-1];
            }
            arr[0] = last;

            for(int x: arr){
                System.out.print(x + " ");
            }
    }
}