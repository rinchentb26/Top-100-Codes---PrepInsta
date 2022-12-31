import java.util.Scanner;

class Main {
    public static int hcf(int n1, int n2) {
        int hcf = 1;
        int min_num;
        if (n1 < n2) {
            min_num = n1;
        } else {
            min_num = n2;
        }
        for (int i = 2; i <= min_num; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                hcf = i;
            }
        }
        return hcf;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        sc.close();
        System.out.println(hcf(num1, num2));
    }
}