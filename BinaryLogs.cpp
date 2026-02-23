#include <iostream>
using namespace std;

int BinaryLog(int n);

int main() {
    int number;
    cout << "Enter a positive integer: ";
    cin >> number;

    if (number > 0) {
        int result = BinaryLog(number);
        cout << "The binary logarithm of " << number << " is: " << result << endl;
    } else {
        cout << "Please enter a positive integer." << endl;
    }
    return 0;
}

// Function to calculate binary logarithm
int BinaryLog(int n) {
    int count = 0;
    while (n >= 1) {
        n /= 2;
        count++;
    }
    return count - 1; 
    
}
