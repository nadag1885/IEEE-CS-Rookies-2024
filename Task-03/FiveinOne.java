import java.util.Scanner;

public class FiveinOne {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int[] arr=new int[N];

        for(int i=0; i<N; i++)
            arr[i]=scanner.nextInt();

        System.out.println("The maximum number : "+Max(arr));
        System.out.println("The minimum number : "+Min(arr));
        System.out.println("The number of prime numbers : "+prime_numbers(arr));
        System.out.println("The number of palindrome numbers : "+palindrome_numbers(arr));
        System.out.println("The number that has the maximum number of divisors : "+MaxDivisors(arr));
    }


    public static int Max(int[] arr){
        int max=Integer.MIN_VALUE;
        for (int i : arr){
            if(max<i)
                max=i;
        }
        return max;
    }

    public static int Min(int[] arr){
        int min=Integer.MAX_VALUE;
        for (int i : arr){
            if(min>i)
                min=i;
        }
        return min;
    }

    public static int prime_numbers(int[] arr){
        int count=0;
        for (int i : arr) {
            boolean isPrime = true;
            if (i <= 1) {
                isPrime = false;
            } else {
                for (int j = 2; j * j <= i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                count++;
            }
        }
        return count;
        }

    public  static int Reversed(int number){
        int rev=0;
        while (number != 0) {
            int digit = number % 10;
            rev = rev * 10 + digit;
            number /= 10;
        }
        return rev;
    }

    public static int  palindrome_numbers(int[] arr){
        int count=0;
        for(int i : arr){
            if(Reversed(i)==i)
                count++;
        }
        return count;
    }
    public static int countDivisors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        return count;
    }

    public static int MaxDivisors(int[] arr) {
        int max=0;
        int maxNum=0;
        for (int i=0;i<arr.length;i++){
            if(max<countDivisors(arr[i])){
                max=countDivisors(arr[i]);
                maxNum=arr[i];
            } else if (countDivisors(arr[i])==max && arr[i]>maxNum) {
                maxNum=arr[i];
            }
        }
        return maxNum;
    }

}
