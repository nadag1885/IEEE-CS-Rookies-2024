import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long A=scanner.nextInt();
        long B=scanner.nextInt();

        System.out.println(GCD(A,B)+" "+LCM(A,B));
    }

    public static long GCD(long a, long b){
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static long LCM(long A , long B){

        return (A*B)/GCD(A,B);
    }
}
