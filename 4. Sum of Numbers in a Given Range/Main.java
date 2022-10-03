import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num1,num2;
        num1=sc.nextInt();
        num2=sc.nextInt();
        int sum=0;
        for(int i=num1;i<=num2;i++)
        {
            sum+=i;
        }
        System.out.println("SUM: "+sum);
        sc.close();
    }
}