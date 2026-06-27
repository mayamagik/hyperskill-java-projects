import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];



        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        boolean sortedAsc = true;

        for(int i = 1; i < arr.length; i++){
            if ( arr[i-1] > arr[i] ){
                sortedAsc = false;
                break;

            }

        }System.out.println(sortedAsc);
    }
}