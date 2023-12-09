import java.util.Scanner;

public class SwappingWithMatrix {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int X=scanner.nextInt();
        int Y=scanner.nextInt();
        int[][] arr=new int[N][N];
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++)
                arr[i][j]=scanner.nextInt();
        }

        Swap(arr,X,Y);
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


    }


    public static void Swap(int[][] arr,int X,int Y){
        int[] temp1 = arr[X - 1];
        arr[X - 1] = arr[Y - 1];
        arr[Y - 1] = temp1;


        for(int i=0; i<arr.length;i++){
            int temp2=arr[i][X-1];
            arr[i][X-1]=arr[i][Y-1];
            arr[i][Y-1]=temp2;
            }
    }


}
