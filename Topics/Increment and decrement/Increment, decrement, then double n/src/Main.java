/*import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // Read the integer input
        int n = Integer.parseInt(reader.readLine());

        // TODO: Increment n by 1
        n++;

        // TODO: Decrement n by 2
        n = n - 2;
        // TODO: Double the resulting value of n
        n = n * 2;
        // Print the final value of n
        System.out.println(n);
    }
}*/

class Main {
    public static void main(String[] args) {
        int condition1 = 175892;
        int condition2 = 98795;

        if ((condition1 & condition2) > 35925) {
            printXor(condition1 - condition2, condition1 | condition2); // 1
        } else {
            printXor(condition1 ^ condition2, condition1 & condition2); // 2
        }
    }

    static void printXor(int condition1, int condition2) {
        System.out.println(condition1 ^ condition2);
    }
}