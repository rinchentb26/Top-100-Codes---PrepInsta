import java.nio.file.NotLinkException;
import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        /*
         * A number n is said to be Abundant Number to follow these condition:-
         * 1. The sum of its proper divisors is greater than the number itself
         * 2. The difference between these two values is called the abundance.
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        System.out.println(sum > n ? "Abundant Number" : "Not Abundant");
        sc.close();
    }
}