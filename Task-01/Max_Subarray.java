import java.util.Scanner;

public class Max_Subarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T=scanner.nextInt();
        for(int t=0;t<T;t++){
            int N=scanner.nextInt();
            int[] arr = new int[N+1];

            for (int i = 0; i < N; i++) {
                arr[i] = scanner.nextInt();
            }


            for (int i = 0; i < N; i++) {
                for (int j = i; j < N; j++) {
                    int maxNum = Integer.MIN_VALUE;
                    for (int k = i; k <= j; k++) {
                        maxNum = Math.max(maxNum, arr[k]);
                    }
                    System.out.print(maxNum + " ");
                }
            }
            System.out.println();

        }
    }
}
