import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];


        int maxIndex  = 0;
        for(int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
            if (array[i] > array[maxIndex]){
                maxIndex = i;
            }
        }
        System.out.println(maxIndex);

    }
}