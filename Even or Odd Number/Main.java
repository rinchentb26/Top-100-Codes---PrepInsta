import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        if (n % 2 == 0)
            System.out.println("Number is even.");
        else
            System.out.println("Number is odd.");
        sc.close();
    }
}