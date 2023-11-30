import java.util.Scanner;

public class ReplaceMinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            int N = scanner.nextInt();
            int[] arr = new int[N + 1];

            for (int i = 0; i < N; i++) {
                arr[i] = scanner.nextInt();
            }
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            int minI=-1;
            int maxI=-1;
            for(int i =0;i<N;i++){
                if(arr[i]<min){
                    min=arr[i];
                    minI=i;
                }
                if (arr[i]>max){
                    max=arr[i];
                    maxI=i;
                }

            }
            int temp = arr[maxI];
            arr[maxI] = arr[minI];
            arr[minI] = temp;
            for(int j=0;j<N;j++){
                System.out.print(arr[j]+" ");
            }

        }
    }

