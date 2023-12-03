import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String S=scanner.nextLine();
        char[] charArray = S.toCharArray();
        char []symbols= {' ','!','.',',','?'};     //'!', '.', '?' and ','
        int count=0;
        boolean inWord = false;

        for (char ch : charArray) {
            boolean isSymbol = false;

            for (char symbol : symbols) {
                if (ch == symbol) {
                    isSymbol = true;
                    break;
                }
            }

            if (!isSymbol) {
                inWord = true;
            } else {
                if (inWord) {
                    count++;
                    inWord = false;
                }
            }
        }

        if (inWord) {
            count++;
        }


        System.out.println(count);
    }

}
