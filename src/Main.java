import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Question 1: Basic arithmetic operations
        performArithmeticOperations(scanner);

        // Question 2: Multiplication table
        printMultiplicationTable(scanner);

        // Question 3: Circle area and perimeter
        calculateCircleProperties(scanner);

        // Question 4: Average of integers
        calculateAverage(scanner);

        // Question 5: Sum equality check
        checkSumEquality(scanner);

        // Question 6: Reverse a word
        reverseWord(scanner);

        // Question 7: Even or odd check
        checkEvenOrOdd(scanner);

        // Question 8: Temperature conversion
        convertTemperature(scanner);

        // Question 9: Character at index
        getCharacterAtIndex(scanner);

        // Question 10: Rectangle area and perimeter
        calculateRectangleProperties(scanner);

        // Question 11: Compare two numbers
        compareTwoNumbers(scanner);

        // Question 12: Convert seconds
        convertSeconds(scanner);

        // Question 13: Check if four numbers are equal
        checkFourNumbersEquality(scanner);

        // Question 14: Check positive/negative/zero
        checkNumberSign(scanner);

        // Question 15: Count positive/negative/zero numbers
        countNumberTypes(scanner);

        // Question 16: Reverse digits
        reverseDigits(scanner);

        // Question 17: Find max and min
        findMaxAndMin(scanner);

        // Question 18: Count character 'a'
        countCharacterA(scanner);

        scanner.close();
    }

    // Question 1: Basic arithmetic operations
    public static void performArithmeticOperations(Scanner scanner) {
        System.out.println("\n=== Question 1: Basic Arithmetic Operations ===");
        try {
            System.out.print("Input first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Input second number: ");
            int num2 = scanner.nextInt();

            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));

            if (num2 == 0) {
                System.out.println("Cannot divide by zero!");
            } else {
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid integers");
            scanner.nextLine(); // Clear invalid input
        }
    }

    // Question 2: Multiplication table
    public static void printMultiplicationTable(Scanner scanner) {
        System.out.println("\n=== Question 2: Multiplication Table ===");
        try {
            System.out.print("Input number: ");
            int num = scanner.nextInt();

            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " X " + i + " = " + (num * i));
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer");
            scanner.nextLine();
        }
    }

    // Question 3: Circle area and perimeter
    public static void calculateCircleProperties(Scanner scanner) {
        System.out.println("\n=== Question 3: Circle Properties ===");
        try {
            System.out.print("Enter radius: ");
            double radius = scanner.nextDouble();

            if (radius < 0) {
                throw new IllegalArgumentException("Radius cannot be negative");
            }

            double perimeter = 2 * Math.PI * radius;
            double area = Math.PI * radius * radius;

            System.out.printf("Perimeter: %.2f%n", perimeter);
            System.out.printf("Area: %.2f%n", area);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid number");
            scanner.nextLine();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Question 4: Average of integers
    public static void calculateAverage(Scanner scanner) {
        System.out.println("\n=== Question 4: Average Calculator ===");
        try {
            System.out.print("Enter the count of numbers: ");
            int count = scanner.nextInt();

            if (count <= 0) {
                throw new IllegalArgumentException("Count must be positive");
            }

            int sum = 0;
            for (int i = 1; i <= count; i++) {
                System.out.print("Enter integer " + i + ": ");
                sum += scanner.nextInt();
            }

            double average = (double) sum / count;
            System.out.println("The average is: " + average);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid integers");
            scanner.nextLine();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Question 5: Sum equality check
    public static void checkSumEquality(Scanner scanner) {
        System.out.println("\n=== Question 5: Sum Equality Check ===");
        try {
            System.out.print("Input the first number: ");
            int first = scanner.nextInt();
            System.out.print("Input the second number: ");
            int second = scanner.nextInt();
            System.out.print("Input the third number: ");
            int third = scanner.nextInt();

            boolean result = (first + second) == third;
            System.out.println("The result is: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid integers");
            scanner.nextLine();
        }
    }

    // Question 6: Reverse a word
    public static void reverseWord(Scanner scanner) {
        System.out.println("\n=== Question 6: Word Reversal ===");
        try {
            System.out.print("Input a word: ");
            String word = scanner.next();

            if (word.matches("\\d+")) {
                throw new IllegalArgumentException("Input should be a word, not a number");
            }

            StringBuilder reversed = new StringBuilder(word).reverse();
            System.out.println("Reverse word: " + reversed);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Question 7: Even or odd check
    public static void checkEvenOrOdd(Scanner scanner) {
        System.out.println("\n=== Question 7: Even/Odd Check ===");
        try {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number % 2 == 0) {
                System.out.println("The number is even");
            } else {
                System.out.println("The number is odd");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer");
            scanner.nextLine();
        }
    }

    // Question 8: Temperature conversion
    public static void convertTemperature(Scanner scanner) {
        System.out.println("\n=== Question 8: Temperature Conversion ===");
        try {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = scanner.nextDouble();

            double fahrenheit = (celsius * 1.8) + 32;
            System.out.printf("Temperature in Fahrenheit: %.2f%n", fahrenheit);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid number");
        }
    }

    // Question 9: Character at index
    public static void getCharacterAtIndex(Scanner scanner) {
        System.out.println("\n=== Question 9: Character at Index ===");
        try {
            scanner.nextLine(); // Clear buffer
            System.out.print("Input a string: ");
            String text = scanner.nextLine();
            System.out.print("Input an index: ");
            int index = scanner.nextInt();

            if (index < 0 || index >= text.length()) {
                throw new StringIndexOutOfBoundsException("Index out of bounds");
            }

            System.out.println("Character at index " + index + ": " + text.charAt(index));
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer for index");
            scanner.nextLine();
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Question 10: Rectangle properties
    public static void calculateRectangleProperties(Scanner scanner) {
        System.out.println("\n=== Question 10: Rectangle Properties ===");
        try {
            System.out.print("Enter width: ");
            double width = scanner.nextDouble();
            System.out.print("Enter height: ");
            double height = scanner.nextDouble();

            if (width < 0 || height < 0) {
                throw new IllegalArgumentException("Width and height must be non-negative");
            }

            double area = width * height;
            double perimeter = 2 * (width + height);

            System.out.printf("Area: %.2f%n", area);
            System.out.printf("Perimeter: %.2f%n", perimeter);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid numbers");
            scanner.nextLine();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Question 11: Compare two numbers
    public static void compareTwoNumbers(Scanner scanner) {
        System.out.println("\n=== Question 11: Number Comparison ===");
        try {
            System.out.print("Input first integer: ");
            int num1 = scanner.nextInt();
            System.out.print("Input second integer: ");
            int num2 = scanner.nextInt();

            if(num1 != num2){
                System.out.println(num1 +"!="+num2);
            }
            if(num1<num2){
                System.out.println(num1 +"<"+num2);
            }
            if(num1>num2){
                System.out.println(num1 +">"+num2);
            }
            if(num1<=num2){
                System.out.println(num1 +"<="+num2);
            }
            if(num1>=num2){
                System.out.println(num1 +">="+num2);
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid integers");
            scanner.nextLine();
        }
    }

    // Question 12: Convert seconds
    public static void convertSeconds(Scanner scanner) {
        System.out.println("\n=== Question 12: Time Conversion ===");
        try {
            System.out.print("Input seconds: ");
            int totalSeconds = scanner.nextInt();

            if (totalSeconds < 0) {
                throw new IllegalArgumentException("Seconds cannot be negative");
            }

            int hours = totalSeconds / 3600;
            int minutes = (totalSeconds % 3600) / 60;
            int seconds = totalSeconds % 60;

            System.out.printf("%d:%02d:%02d%n", hours, minutes, seconds);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer");
            scanner.nextLine();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Question 13: Check if four numbers are equal
    public static void checkFourNumbersEquality(Scanner scanner) {
        System.out.println("\n=== Question 13: Four Numbers Equality ===");
        try {
            System.out.print("Input first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Input second number: ");
            int num2 = scanner.nextInt();
            System.out.print("Input third number: ");
            int num3 = scanner.nextInt();
            System.out.print("Input fourth number: ");
            int num4 = scanner.nextInt();

            if (num1 == num2 && num2 == num3 && num3 == num4) {
                System.out.println("Numbers are equal");
            } else {
                System.out.println("Numbers are not equal");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid integers");
            scanner.nextLine();
        }
    }

    // Question 14: Check number sign
    public static void checkNumberSign(Scanner scanner) {
        System.out.println("\n=== Question 14: Number Sign Check ===");
        try {
            System.out.print("Input a number: ");
            int number = scanner.nextInt();

            if (number > 0) {
                System.out.println("Number is positive");
            } else if (number < 0) {
                System.out.println("Number is negative");
            } else {
                System.out.println("Number is zero");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer");
            scanner.nextLine();
        }
    }

    // Question 15: Count number types
    public static void countNumberTypes(Scanner scanner) {
        System.out.println("\n=== Question 15: Count Number Types ===");
        int positiveCount = 0, negativeCount = 0, zeroCount = 0;

        try {
            System.out.println("Enter numbers (enter -1 to stop):");
            int number;

            do {
                System.out.print("Enter a number: ");
                number = scanner.nextInt();

                if (number > 0) {
                    positiveCount++;
                } else if (number < 0 && number != -1) {
                    negativeCount++;
                } else if (number == 0) {
                    zeroCount++;
                }
            } while (number != -1);

            System.out.println(positiveCount + " Positive");
            System.out.println(zeroCount + " Zero");
            System.out.println(negativeCount + " Negative");
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid integers");
            scanner.nextLine();
        }
    }

    // Question 16: Reverse digits
    public static void reverseDigits(Scanner scanner) {
        System.out.println("\n=== Question 16: Reverse Digits ===");
        try {
            System.out.print("Input an integer: ");
            int number = scanner.nextInt();

            String numberStr = String.valueOf(Math.abs(number)); // Handle negative numbers
            StringBuilder reversed = new StringBuilder(numberStr).reverse();

            System.out.print("The reverse is: ");
            if (number < 0) System.out.print("-");
            System.out.println(reversed);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer");
            scanner.nextLine();
        }
    }

    // Question 17: Find max and min
    public static void findMaxAndMin(Scanner scanner) {
        System.out.println("\n=== Question 17: Find Max and Min ===");
        try {
            System.out.print("Enter first number: ");
            int firstNumber = scanner.nextInt();
            int maxValue = firstNumber;
            int minValue = firstNumber;

            char choice;
            do {
                System.out.print("Enter another number: ");
                int number = scanner.nextInt();

                if (number > maxValue) maxValue = number;
                if (number < minValue) minValue = number;

                System.out.print("Continue? (y/n): ");
                choice = scanner.next().toLowerCase().charAt(0);
            } while (choice == 'y');

            System.out.println("Largest number: " + maxValue);
            System.out.println("Smallest number: " + minValue);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid input");
            scanner.nextLine();
        }
    }

    // Question 18: Count character 'a'
    public static void countCharacterA(Scanner scanner) {
        System.out.println("\n=== Question 18: Count Character 'a' ===");
        try {
            scanner.nextLine(); // Clear buffer
            System.out.print("Enter a string: ");
            String text = scanner.nextLine();

            int count = 0;
            for (char c : text.toCharArray()) {
                if (c == 'a' || c == 'A') {
                    count++;
                }
            }

            System.out.println("Number of 'a's: " + count);
        } catch (Exception e) {
            System.out.println("Error processing string: " + e.getMessage());
        }
    }
}