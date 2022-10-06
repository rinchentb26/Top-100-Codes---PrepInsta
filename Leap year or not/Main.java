import java.util.Scanner;
/* Leap Year Logic
Leap Years are any year that can be exactly divided by 4 (such as 2016, 2020, 2024, etc)
except if it can be exactly divided by 100, then it isn't (such as 2100, 2200, etc)
except if it can be exactly divided by 400, then it is (such as 2000, 2400)
*/
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int year;
        year = sc.nextInt();
        if(year%400==0)
            System.out.println("Leap Year.");
        else if (year%4==0 && year%100!=0)
        {
            System.out.println("Leap Year.");
        }
        else
        {
           System.out.println("Non Leap Year.");
        }
    }
}

