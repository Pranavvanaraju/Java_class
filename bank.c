#include <stdio.h>

int main() {
    float balance = 0;   // initial balance
    int choice = 0;
    float amount = 0;

    while (choice != 4) {

        printf("\n1.Deposit  2.Withdraw  3.Balance  4.Exit\n");
        printf("Enter choice: ");
        scanf("%d", &choice);

        if (choice == 1) {
            printf("Enter amount: ");
            scanf("%f", &amount);

            if (amount > 0) {
                balance = balance + amount;
                printf("Deposited!\n");
            } else {
                printf("Invalid amount\n");
            }
        }

        else if (choice == 2) {
            printf("Enter amount: ");
            scanf("%f", &amount);

            if (amount <= 0) {
                printf("Invalid amount\n");
            } 
            else if (amount > balance) {
                printf("Not enough balance\n");
            } 
            else {
                balance = balance - amount;
                printf("Withdrawn!\n");
            }
        }

        else if (choice == 3) {
            printf("Balance = %.2f\n", balance);
        }

        else if (choice == 4) {
            printf("Exit\n");
        }

        else {
            printf("Wrong choice\n");
        }
    }

    return 0;
}