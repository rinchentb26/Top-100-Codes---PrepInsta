import java.util.Scanner;

class Main {
    static int getLen(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public static void main(String args[]) {
        int n, copy, sum;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        copy = n;
        sum = 0;
        int power = getLen(n);
        while (copy > 0) {
            sum += Math.pow(copy % 10, power);
            copy /= 10;
        }
        System.out.println(sum == n ? "Armstrong Number" : "Not Armstrong");
        sc.close();
    }
}