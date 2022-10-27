import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int prev, curr, next;
        prev = 0;
        curr = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(prev + "\t");
            next = prev + curr;
            prev = curr;
            curr = next;
        }
        sc.close();
    }
}