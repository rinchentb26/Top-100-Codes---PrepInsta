import java.util.Scanner;

class Main {
    public static int getDivisorSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    // Friendly pair(Amicable numbers) are two different numbers related in a way
    // such that the Ratio’s sum of the proper divisors divided by number itself for
    // each is same
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        int divisor_sum_num1 = getDivisorSum(num1);
        int divisor_sum_num2 = getDivisorSum(num2);
        boolean flag;
        flag = (divisor_sum_num1 / num1) == (divisor_sum_num2 / num2) ? true : false;
        System.out.println(flag == true ? "Friendly Pair" : "Non Friendly Pair");
        sc.close();
    }
}