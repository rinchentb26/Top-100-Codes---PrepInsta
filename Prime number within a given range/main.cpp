#include <iostream>
using namespace std;
int main()
{
    int m, n;
    cin >> m >> n;
    int isPrime;
    for (int i = m; i <= n; i++)
    {
        isPrime = 1;
        if (i <= 1)
            isPrime = 0;
        ` for (int j = 2; j <= i / 2; j++)
        {
            if (i % j == 0)
            {
                isPrime = 0;
                break;
            }
        }
        if (isPrime == 1)
            cout << i << "\t";
    }
    return 0;
}