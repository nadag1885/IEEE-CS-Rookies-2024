import java.util.Scanner;
public class Print {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        Print(N);
    }

    public static void Print(int N){
        for(int i=1;i<=N;i++){
            System.out.print(i);
            if(i<N)
                System.out.print(" ");
        }
    }
}
