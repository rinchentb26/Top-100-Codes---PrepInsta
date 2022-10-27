import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        int prev, curr, next;
        prev = 0;
        curr = 1;
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                System.out.println(prev);
            }
            next = prev + curr;
            prev = curr;
            curr = next;
        }
        sc.close();
    }
}