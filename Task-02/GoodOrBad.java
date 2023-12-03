import java.util.Scanner;

public class GoodOrBad {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int T=scanner.nextInt();
        scanner.nextLine();
        for(int t=0;t<T;t++){
            String S=scanner.nextLine();

//                if(S.charAt(i) != '0' || S.charAt(i)!='1'){
//                    System.out.println("Bad");
//                    break;
//                }
                if (S.contains("010") || S.contains("101")) {
                    System.out.println("Good");
                } else {
                    System.out.println("Bad");
                }

        }

    }
}