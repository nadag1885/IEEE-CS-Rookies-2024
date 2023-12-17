import java.util.Scanner;

public class ReachValue {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long T=scanner.nextLong();

        for(int t=0; t<T; t++) {
            double N = scanner.nextDouble();
            if(isReachValue(N))
                System.out.println("YES");
            else
                System.out.println("NO");


        }
    }

    public static  boolean isReachValue(double N){
        if(N==1)
            return true;
        else if (N < 1)
            return false;
        else
            return isReachValue(N / 10) || isReachValue(N / 20);


    }
}
