#include <stdio.h>

// 1. Add two numbers
void addTwoNumbers(int a, int b) {
    printf("Sum = %d\n", a + b);
}

// 2. Even or Odd
void checkEvenOdd(int n) {
    if (n % 2 == 0)
        printf("Even\n");
    else
        printf("Odd\n");
}

// 3. Sum of natural numbers
void sumNatural(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++)
        sum += i;
    printf("Sum = %d\n", sum);
}

// 4. Swap two numbers
void swapNumbers(int a, int b) {
    printf("Before Swap: a = %d, b = %d\n", a, b);
    int temp = a;
    a = b;
    b = temp;
    printf("After Swap: a = %d, b = %d\n", a, b);
}

// 5. Largest of three numbers
void largest(int a, int b, int c) {
    int max = a;
    if (b > max) max = b;
    if (c > max) max = c;
    printf("Largest = %d\n", max);
}

// 6. Factorial
void factorial(int n) {
    int fact = 1;
    for (int i = 1; i <= n; i++)
        fact *= i;
    printf("Factorial = %d\n", fact);
}

// 7. Reverse a number
void reverse(int n) {
    int rev = 0;
    while (n != 0) {
        int digit = n % 10;
        rev = rev * 10 + digit;
        n /= 10;
    }
    printf("Reversed Number = %d\n", rev);
}

// 8. Fibonacci series
void fibonacci(int n) {
    int a = 0, b = 1;
    printf("Fibonacci: ");
    for (int i = 1; i <= n; i++) {
        printf("%d ", a);
        int next = a + b;
        a = b;
        b = next;
    }
    printf("\n");
}

// 9. Prime number check
void checkPrime(int n) {
    if (n <= 1) {
        printf("Not Prime\n");
        return;
    }
    for (int i = 2; i <= n / 2; i++) {
        if (n % i == 0) {
            printf("Not Prime\n");
            return;
        }
    }
    printf("Prime\n");
}

// 10. Multiplication table
void multiplicationTable(int n) {
    for (int i = 1; i <= 10; i++) {
        printf("%d x %d = %d\n", n, i, n * i);
    }
}

int main() {
    int choice;

    while (1) {
        printf("\n--- MENU ---\n");
        printf("1. Add Two Numbers\n");
        printf("2. Even or Odd\n");
        printf("3. Sum of Natural Numbers\n");
        printf("4. Swap Two Numbers\n");
        printf("5. Largest of Three Numbers\n");
        printf("6. Factorial\n");
        printf("7. Reverse Number\n");
        printf("8. Fibonacci Series\n");
        printf("9. Prime Check\n");
        printf("10. Multiplication Table\n");
        printf("11. Exit\n");

        printf("Enter choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1: {
                int a, b;
                printf("Enter two numbers: ");
                scanf("%d %d", &a, &b);
                addTwoNumbers(a, b);
                break;
            }

            case 2: {
                int n;
                printf("Enter number: ");
                scanf("%d", &n);
                checkEvenOdd(n);
                break;
            }

            case 3: {
                int n;
                printf("Enter n: ");
                scanf("%d", &n);
                sumNatural(n);
                break;
            }

            case 4: {
                int a, b;
                printf("Enter two numbers: ");
                scanf("%d %d", &a, &b);
                swapNumbers(a, b);
                break;
            }

            case 5: {
                int a, b, c;
                printf("Enter three numbers: ");
                scanf("%d %d %d", &a, &b, &c);
                largest(a, b, c);
                break;
            }

            case 6: {
                int n;
                printf("Enter number: ");
                scanf("%d", &n);
                factorial(n);
                break;
            }

            case 7: {
                int n;
                printf("Enter number: ");
                scanf("%d", &n);
                reverse(n);
                break;
            }

            case 8: {
                int n;
                printf("Enter terms: ");
                scanf("%d", &n);
                fibonacci(n);
                break;
            }

            case 9: {
                int n;
                printf("Enter number: ");
                scanf("%d", &n);
                checkPrime(n);
                break;
            }

            case 10: {
                int n;
                printf("Enter number: ");
                scanf("%d", &n);
                multiplicationTable(n);
                break;
            }

            case 11:
                printf("Exiting...\n");
                return 0;

            default:
                printf("Invalid choice!\n");
        }
    }

    return 0;
}