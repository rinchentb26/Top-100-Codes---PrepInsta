import java.util.Scanner;

// A Strong Number is a number whose sum of factorial digits is equal to the number itself.
class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        sc.close();
        int copy = n;
        int digit;
        int sum = 0;
        // 145
        while (copy > 0) {
            digit = copy % 10;
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }
            sum += fact;
            copy /= 10;
        }
        System.out.println(sum == n ? "Strong Number" : "Not Strong");
    }
}