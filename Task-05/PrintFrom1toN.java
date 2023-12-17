import java.util.Scanner;

public class PrintFrom1toN {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        print(N);

    }
    public static void print(int N){
        if(N>0){
            print(N-1);
            System.out.println(N);

        }
    }
}
