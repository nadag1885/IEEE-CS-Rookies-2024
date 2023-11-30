import java.util.Scanner;

public class CountSubarrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            int[] arr = new int[N + 1];

            for (int i = 0; i < N; i++) {
                arr[i] = scanner.nextInt();
            }

            int count=0;
            for(int i=0;i<N;i++) {
                for(int j=i;j<N;j++){
                    boolean flag=true;
                    for (int k = i + 1; k <= j; k++) {
                        if (arr[k] < arr[k - 1]) {
                            flag = false;
                            break;
                        }
                    }
                    if(flag)
                        count+=1;
                }

            }
            System.out.println(count);
            }

        }
    }

