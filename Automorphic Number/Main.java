import java.util.Scanner;

// Automorphic number is a number whose square ends with the same digits as number itself.
class Main {
    public static void main(String args[]) {
        int n, squared;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        squared = n * n;
        int flag = 1;
        while (n > 0) {
            if ((n % 10) != (squared % 10)) {
                flag = 0;
                break;
            }
            n /= 10;
            squared /= 10;
        }
        System.out.println(flag == 1 ? "Automorphic Number" : "Non Automorphic Number");
        sc.close();
    }
}