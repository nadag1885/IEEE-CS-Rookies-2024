import java.util.Scanner;

public class CombinationandPermutation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int A=scanner.nextInt();
        int B=scanner.nextInt();

        if (A >= B) {
            NCRandNPR(A, B);
        } else {
            System.out.println("A should be greater than or equal to B.");
        }

    }

    public static long factorial(int N){
        if(N==0 || N==1)
            return 1;
        else
            return N * factorial(N-1);
    }

    public static void NCRandNPR(int A,int B){
        long NCR=factorial(A) / (factorial(B) * factorial((A-B)));
        long NPR = factorial(A) / factorial((A - B));
        System.out.println(NCR + " " + NPR);
    }

}
