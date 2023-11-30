import java.util.Scanner;
public class PermutationWithArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            B[i] = scanner.nextInt();
        }

        boolean isPermutation=true;
        for(int i=0;i<N;i++){
            boolean found=false;
            for(int j=0;j<N;j++){
                if(B[i]==A[j]){
                    found=true;
                    break;
                }
            }
            if(!found){
                isPermutation=false;
                break;

            }
        }
        if(isPermutation)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
