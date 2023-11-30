import java.util.Scanner;

public class IsBasubsequenceofA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] A = new int[N];
        int[] B = new int[M];

        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        for (int i = 0; i < M; i++) {
            B[i] = scanner.nextInt();
        }

        boolean isSubsequence = isSubsequence(A, B);
        if (isSubsequence) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }

    public static boolean isSubsequence(int[] A, int[] B) {
        int i = 0, j = 0;

        while (i < A.length && j < B.length) {
            if (A[i] == B[j]) {
                j++;
            }
            i++;
        }

        return j == B.length;
    }
}

