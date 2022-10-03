import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        int sum=0;
        n = sc.nextInt();
        sum = n*(n+1)/2;
        System.out.println("Sum: "+sum);
    }
}