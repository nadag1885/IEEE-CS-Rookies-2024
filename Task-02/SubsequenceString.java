import java.util.Scanner;
public class SubsequenceString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String S=scanner.nextLine();
        //a h h e l l l l l o o  u
        //0 1 2 3 4 5 6 7 8 9 10 11
        //              01234
        String target="hello";
        int j=0;

        for(int i=0;i<S.length();i++){
            if(S.charAt(i)==target.charAt(j)){
                j++;
                if(j==target.length()){
                    break;
                }
            }
        }
        if(j==target.length())
            System.out.println("YES");
        else
            System.out.println("NO");



    }
}
