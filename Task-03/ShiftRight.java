import java.util.Scanner;

public class ShiftRight {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int X=scanner.nextInt();
        int[] arr=new int[N];

        for(int i=0; i<N; i++)
            arr[i]=scanner.nextInt();

        Shift(arr,X);
        for (int i=0;i<N;i++)
            System.out.print(arr[i]+" ");

    }

    public static void Shift(int[] arr,int X){
        for(int k=0;k<X;k++){
            int last=arr[arr.length-1];
            for(int i=arr.length-1;i>0;i--){
                arr[i]=arr[i-1];
            }
            arr[0]=last;
        }

    }

}
