#include <iostream>
using namespace std;
int main()
{
    int n;
    cin >> n;
    int reversed_no = 0;
    int copy = n;
    while (copy)
    {
        reversed_no = reversed_no * 10 + copy % 10;
        copy /= 10;
    }
    reversed_no == n ? cout << "Palindrome.\n" : cout << "Non-Palindrome.";
    return 0;
}