import java.util.Scanner;
public class CheckCode {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        boolean flag=true;
        int A= scanner.nextInt();
        int B= scanner.nextInt();
        scanner.nextLine(); // Move to the next line after reading integers
        String code =scanner.nextLine();
        if (code.length()!=(A+B+1)){
            flag=false;
//            System.out.println("No");
        } else if (code.charAt(A) != '-') {
            flag=false;
//            System.out.println("No");
        }else{
            for(int i= 0;i<code.length();i++){
                if(i == A)
                    continue;
                if(!Character.isDigit(code.charAt(i))){
                    flag=false;
//                    System.out.println("No");
                    break;
                }
            }
        }
       if(flag)
           System.out.println("Yes");
       else
           System.out.println("No");

    }
}
