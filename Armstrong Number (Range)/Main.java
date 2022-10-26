import java.util.Scanner;

/*\
An Armstrong number is any number that sums up to itself when each of its digits is raised to the power of total number of digits in the number. 
 */
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
        Scanner sc = new Scanner(System.in);
        int a, b, copy, sum;
        a = sc.nextInt();
        b = sc.nextInt();
        for (int i = a; i <= b; i++) {
            sum = 0;
            copy = i;
            while (copy > 0) {
                sum += Math.pow(copy % 10, getLen(i));
                copy /= 10;
            }
            if (sum == i)
                System.out.print(i + "\t");
        }
        sc.close();
    }
}