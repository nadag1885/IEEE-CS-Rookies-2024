import java.util.Scanner;
public class MinimizeNumber {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int N=scanner.nextInt();
        int [] arr=new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        int op=0;
        boolean flag=true;
        while (flag){
            for(int i=0;i<N;i++){
                if(arr[i]%2 !=0){
                    flag=false;
                }
            }
            if(flag==false)
                break;
            else {
                for(int i=0;i<N;i++){
                    arr[i]/=2;
                    }
            }
            op+=1;

        }
        System.out.println(op);
    }
}
