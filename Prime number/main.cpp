#include <iostream>
using namespace std;

int main()
{
    int n;
    cin >> n;
    int isPrime = 1;
    if (n <= 1)
        isPrime = 0;
    for (int i = 2; i <= n / 2; i++)
    {
        if (n % i == 0)
        {
            isPrime = 0;
            break;
        }
    }
    isPrime == 1 ? cout << "Prime" : cout << "Non Prime";
    return 0;
}