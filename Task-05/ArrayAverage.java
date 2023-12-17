import java.util.Scanner;

public class ArrayAverage {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int[] A=new int[N];

        for(int i=0; i<N; i++)
            A[i]=scanner.nextInt();

        System.out.println(Sum(N-1,A)/N);

    }

    public static double Sum(int N,int[] A){
        if(N==0)
            return A[0];
        else{
            return A[N]+Sum(N-1,A);
        }
    }
}
