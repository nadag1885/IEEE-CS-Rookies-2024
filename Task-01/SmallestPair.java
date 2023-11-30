import java.util.Scanner;
public class SmallestPair {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.print("enter number of test cases: ");
        int T=scanner.nextInt();
        for(int t=0;t<T;t++){
            int N=scanner.nextInt();
            int[] arr = new int[N+1];

            for (int i = 1; i <= N; i++) {
                arr[i] = scanner.nextInt();
            }
            int min = Integer.MAX_VALUE;
            for(int i=1;i<=N;i++){
                for(int j=i+1;j<=N;j++){
                    int sum = arr[i] + arr[j] + j - i;
                    min = Math.min(min, sum);
                }
            }
            System.out.println(min);
        }


    }
}
