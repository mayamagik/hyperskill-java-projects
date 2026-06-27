import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int [size];

        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();

        } int count = 0;

        for (int i = 0; i < arr.length - 2; i++){
            if ( arr[i] + 1 == arr[i + 1] && arr[i] + 2 == arr[i + 2]){
                count++;

            }
        }System.out.println(count);

    }
}