import java.util.Scanner;

// A Harshad number is a number that is divisible by the sum of its digits.
class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int sum = 0;
        int copy = n;

        while (copy > 0) {
            sum += (copy % 10);
            copy /= 10;
        }
        System.out.println(n % sum == 0 ? "Harshad Number" : "Not Harshad");
        sc.close();
    }
}