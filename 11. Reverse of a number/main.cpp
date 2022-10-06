#include <iostream>
using namespace std;

int main()
{
    int n;
    cin >> n;
    int reversed_no = 0;
    while (n)
    {
        reversed_no = reversed_no * 10 + n % 10;
        n /= 10;
    }
    cout << "The reversed no is " << reversed_no;
    return 0;
}
