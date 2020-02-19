#include <iostream>
#include <fstream>
#include <stdlib.h>
#include <time.h>

using namespace std;

int main () {
    srand (time(NULL));
    int guess = 0;
    int random = rand() % 100 + 1;
    int count = 0;
    bool correct = false;

    do {
        cout << "Please enter your guess: ";
        cin >> guess;
        count++;
        
        //Print if lower
        if(guess < random) {
            cout << "Your guess is lower than the number\n\n";
        }
        //Print if greater
        else if (guess > random) {
            cout << "Your guess is higher than the number\n\n";
        }
        //Print how many turns it took
        else if(guess == random) {
            cout << "\n\nCorrect! Your number of attempts are: " << count << endl;
            correct = true;
        }
    } while (!correct);

    return 0;
}