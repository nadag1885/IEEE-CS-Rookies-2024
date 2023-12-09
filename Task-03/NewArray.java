import java.util.Scanner;

public class NewArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int[] A=new int[N];
        int[] B=new int[N];

        for(int i=0; i<N; i++)
            A[i]=scanner.nextInt();

        for(int i=0; i<N; i++)
            B[i]=scanner.nextInt();

        int[] C= MergeArrays(N,A,B);
        for (int i=0;i<2*N;i++)
            System.out.print(C[i]+" ");




    }

    public static int[] MergeArrays(int N,int[] A, int[] B){
        int[] C=new int[2*N];
        for(int i=0; i<2*N;i++){
            if(i<N)
                C[i]=B[i];
            else
                C[i]=A[i-N];
        }
        return C;
    }
}


