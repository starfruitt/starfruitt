#include <iostream>
using namespace std;
#include <string>
#include <iomanip>


void CalcAverage();

int main() {
    // Function Call
    CalcAverage();
    return 0;
}

void CalcAverage() {
    // Arrays to store user input
    string weeks[4];
    double gallons[4];
    int miles[4];

    double totalGallons = 0.0;
    int totalMiles = 0;

    // Get user input for each week
    for (int i = 0; i < 4; i++) {
       
        cout << "Enter the date for week " + to_string(i+1)+ " (e.g., February 4) : \n";
        getline(cin, weeks[i]);

        cout << "Enter gallons consumed for " << weeks[i] << ": \n";
        cin >> gallons[i];

        cout << "Enter miles driven for " << weeks[i] << ": \n";
        cin >> miles[i];

        cin.ignore(); // Clear the input buffer
        cout << endl;
    }

    // Display table header
    cout << left << setw(15) << "Week of" << setw(15) << "Gallons" << setw(15) << "Miles" << "Average MPG" << endl;
    cout << left << setw(14) << "_ _ _ _ _ " << setw(15) << "_ _ _ _ _" << setw(15) << "_ _ _ _ " << setw(15) << "_ _ _ _ _ _ _" << endl;
    cout << setfill(' '); // Reset fill character

    // Calculate and display averages
    for (int i = 0; i < 4; i++) {
        double averageMPG = miles[i] / gallons[i];
        cout << left << setw(15) << weeks[i] << setw(15) << gallons[i] << setw(15) << miles[i] << fixed << setprecision(2) << averageMPG << endl;

        totalGallons += gallons[i];
        totalMiles += miles[i];
    }

    //// Calculate and display overall average
    double overallAverageMPG = totalMiles / totalGallons;
    cout << endl;
    cout << "Total Gallons: " << totalGallons << endl;
    cout << "Total Miles: " << totalMiles << endl;
    cout << "Overall Average MPG: " << fixed << setprecision(2) << overallAverageMPG << endl;

}
