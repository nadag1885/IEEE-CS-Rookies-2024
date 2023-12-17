import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();

        System.out.println(SequenceLength(N));

    }

    public static int SequenceLength(int N){
        if(N==1)
            return 1;
        else if (N%2==0)
            return 1+SequenceLength(N/2);
        else
            return 1+SequenceLength( 1+N*3);
    }
}
