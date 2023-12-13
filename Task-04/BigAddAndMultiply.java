import java.util.Scanner;
import java.math.BigInteger;


public class BigAddAndMultiply {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String inputNumber = scanner.nextLine();
        BigInteger N = new BigInteger(inputNumber);

        BigInteger sum = N.add(BigInteger.valueOf(9999));
        System.out.println(sum);

        BigInteger mult = N.multiply(BigInteger.valueOf(9999));
        System.out.println(mult);


    }
}
