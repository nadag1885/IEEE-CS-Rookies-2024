import java.util.Scanner;

public class EncryptDecryptMessage {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int Q=scanner.nextInt();
        scanner.nextLine();
        String S=scanner.nextLine();
        String Key = "PgEfTYaWGHjDAmxQqFLRpCJBownyUKZXkbvzIdshurMilNSVOtec#@_!=.+-*/";
        String Original = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        char [] key=Key.toCharArray();
        char [] original=Original.toCharArray();
        char [] s=S.toCharArray();
        if(Q==1){
            for(int i=0;i<s.length;i++){
                for(int j=0;j<original.length;j++){
                    if(s[i]==original[j]){
                        s[i]=key[j];
                        break;
                    }
                }
            }
        } else if (Q==2) {
            for(int i=0;i<s.length;i++){
                for(int j=0;j<key.length;j++){
                    if(s[i]==key[j]){
                        s[i]=original[j];
                        break;
                    }
                }
            }
        }

        System.out.println(s);
    }
}
