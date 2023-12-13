import java.util.Scanner;

public class Xor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long A = scanner.nextLong();
        long B = scanner.nextLong();
        long Q = scanner.nextLong();
        System.out.println(xorFunction(A, B, Q));
        scanner.close();
    }

    public static long xorFunction(long A, long B, long Q) {
        if (Q % 3 == 1)
            return A;
        else if (Q % 3 == 2)
            return B;
        else
            return A ^ B;
    }
}

