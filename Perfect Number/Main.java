import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        int sum = 0;
        n = sc.nextInt();
        // A perfect number is a positive number that is equal to the sum of all its
        // divisors(excluding itself) excluding itself.
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        System.out.println(sum == n ? "Perfect Number" : "Non Perfect");
    }
}