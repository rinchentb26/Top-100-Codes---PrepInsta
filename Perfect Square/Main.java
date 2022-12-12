import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i = 1, flag = 0;
        while (sum < n) {
            sum = i * i;
            if (sum == n) {
                flag = 1;
                break;
            }
            i++;
        }
        System.out.println(flag == 1 ? "Perfect Square" : "Not Perfect Square");
        sc.close();
    }
}