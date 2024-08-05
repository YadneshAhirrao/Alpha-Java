#include <bits/stdc++.h>
#include <iostream>
using namespace std;

void rotateArray(int arr[], int n, int d)
{
    reverse(arr, arr + d);
    reverse(arr + d, arr + n);
//     reverse(arr, arr + n);
}

int main()
{
    int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int size = sizeof(arr) / sizeof(arr[0]); // Calculate the size of the array

    for (int i = 0; i < size; i++) // Loop up to size
    {
        cout << arr[i] << " "; // Output elements with space
    }
    cout << endl; // Print newline

    rotateArray(arr, size, 3); // Pass correct size to the function

    for (int i = 0; i < size; i++) // Loop up to size
    {
        cout << arr[i] << " "; // Output elements with space
    }
    cout << endl; // Print newline

    return 0;
}
