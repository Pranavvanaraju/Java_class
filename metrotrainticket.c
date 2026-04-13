#include <stdio.h>

int main() {
    int choice = 0;
    int source = 0, dest = 0;
    int booked = 0;
    int fare = 0;

    while (choice != 4) {
        printf("\n1.View Stations 2.Book Ticket 3.Show Ticket 4.Exit\n");
        printf("Enter choice: ");
        scanf("%d", &choice);

        if (choice == 1) {
            printf("1.Chennai\n2.Tambaram\n3.Chengalpattu\n4.Vellore\n");
        }

        else if (choice == 2) {
            printf("Enter source (1-4): ");
            scanf("%d", &source);

            printf("Enter destination (1-4): ");
            scanf("%d", &dest);

            if (source < 1 || source > 4 || dest < 1 || dest > 4) {
                printf("Invalid station\n");
            }
            else if (source == dest) {
                printf("Same station not allowed\n");
            }
            else {
                int distance = source - dest;
                if (distance < 0)
                    distance = -distance;

                fare = distance * 10;
                booked = 1;

                printf("Ticket booked!\n");
            }
        }

        else if (choice == 3) {
            if (booked == 0) {
                printf("No ticket booked\n");
            } else {
                printf("Source = %d\n", source);
                printf("Destination = %d\n", dest);
                printf("Fare = %d\n", fare);
            }
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