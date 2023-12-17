import java.util.Scanner;

public class Knapsack {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int W=scanner.nextInt();
        int[] weight=new int[N];
        int[] value=new  int[N];

        for(int i=0; i<N; i++){
            weight[i]=scanner.nextInt();
            value[i]=scanner.nextInt();
            scanner.nextLine();
        }

        System.out.println(knapsack(W,N,weight,value));


    }
    public static int knapsack(int W,int N,int[] weight,int[] value){
        if(W == 0 || N == 0)
            return 0;
        if(weight[N-1]>W)
            return knapsack(W,N-1,weight,value);
        else {
            return Math.max(value[N-1]+knapsack(W-weight[N-1],N-1,weight,value),knapsack(W,N-1,weight,value));
        }
    }

}
