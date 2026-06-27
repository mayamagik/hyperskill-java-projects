import java.util.Scanner;class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] array = new int[size];


        int sum = 0;
        for(int i = 0; i < array.length; i++ ){
            array[i] = sc.nextInt();

        }int n = sc.nextInt();

        for(int i = 0; i < array.length; i++ ){
            if (array[i] > n ){
                sum+= array[i];
            }
        }
        System.out.println(sum);

    }
}