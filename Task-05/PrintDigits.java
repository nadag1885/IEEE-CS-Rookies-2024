import java.util.Scanner;

public class PrintDigits {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int T=scanner.nextInt();

        for(int t=0; t<T; t++){
            int N=scanner.nextInt();
            String numberAsString = String.valueOf(N);
            char[] c = numberAsString.toCharArray();
            print(c.length-1,c);
            System.out.println();
        }

    }

    public static void print(int L,char[] c){
        if(L>=0){
            print(L-1,c);
            System.out.print(c[L]+" ");
        }

    }
}
