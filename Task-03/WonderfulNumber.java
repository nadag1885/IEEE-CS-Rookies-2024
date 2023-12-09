import java.util.Scanner;
public class WonderfulNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        if(isPalindrome(N))
            System.out.println("YES");
        else
            System.out.println("NO");

    }

    public static String Reversed(String S){
        String rev="";
        for(int i = S.length() - 1; i >= 0; i--){
            rev+=S.charAt(i);
        }
//        System.out.println(rev);
        return rev;
    }

    public static boolean isPalindrome(int N){
        String S = Integer.toBinaryString(N);
//        System.out.println(S);
        if(N%2==0)
            return false;
        else if (Reversed(S).equals(S))
            return true;
        else
            return false;
    }
}
