import java.util.Scanner;
public class MaxSubsequence {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        scanner.nextLine();
        String S=scanner.nextLine();
        S=S.toLowerCase();
        int count=1;
        char temp=S.charAt(0);
        for(int i=0;i<N;i++){
            if (S.charAt(i) != temp) {
                count++;
                temp=S.charAt(i);
            }
        }
        System.out.println(count);
    }
}
