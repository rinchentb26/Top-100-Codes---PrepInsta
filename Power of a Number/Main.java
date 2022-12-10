import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int base, power, res;
        base = sc.nextInt();
        power = sc.nextInt();
        res = 1;
        // 2 ^ 3
        // 1st iteration --> res = 2 e = 2
        // 2nd iteration --> res =4 e =1
        // 3rd iteration --> res =8 e=0
        while (power != 0) {
            res *= base;
            power--;
        }
        System.out.println(res);
        sc.close();
    }
}