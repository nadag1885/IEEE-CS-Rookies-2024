import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String S=scanner.nextLine();

        S =S.replace(',',' ');
        char[] charArray = S.toCharArray();
        for(int i=0; i<charArray.length;i++){
            if(Character.isUpperCase(charArray[i]))
                charArray[i] =Character.toLowerCase(charArray[i]);
            else
               charArray[i]= Character.toUpperCase(charArray[i]);
        }
        S = String.valueOf(charArray);


//        for(int i=0; i<S.length();i++){
//            if(Character.isUpperCase(S.charAt(i)))
//                S =S.replace(S.charAt(i) ,Character.toLowerCase(S.charAt(i)));
//            else
//                S =S.replace(S.charAt(i) ,Character.toUpperCase(S.charAt(i)));
//
//        }
        System.out.println(S);
    }
}
