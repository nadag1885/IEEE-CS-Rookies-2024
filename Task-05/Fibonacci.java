import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();

        System.out.println(fibonacci(N));
    }

    public static int fibonacci(int N){
        if(N == 1)
            return 0;
        else if (N == 2)
            return 1;
        else
            return fibonacci(N-1)+fibonacci(N-2);
    }
}
