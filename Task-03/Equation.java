import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int X=scanner.nextInt();
        int N=scanner.nextInt();
        int res=equation(X,N);
        System.out.println(res);

    }

    public static int equation(int N,int X){
        int res=0;
        for(int i=0;i<=N;i++){
            int term = 1;
            if(i==0)
                res=0;
            else if(i%2==0) {
                for (int j = 0; j < i; j++)
                    term *= X;
                res+=term;
            }
        }
        return res;
    }
}
