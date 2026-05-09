import java.util.Scanner;

public class BudgetSplitterRefactor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double total = readPositiveDouble(sc, "Enter total bill: ");
        int people = readMinInt(sc, "Enter number of people: ", 1);

        double split = calculateSplit(total, people);

        System.out.printf("Each pays: RM %.2f%n", split);

        sc.close();
    }

    // Method 1: Read a positive double (>0)
    static double readPositiveDouble(Scanner sc, String prompt) {

        double value = 0;

        while (value <= 0) {
            System.out.print(prompt);
            value = sc.nextDouble();

            if (value <= 0) {
                System.out.println("Value must be greater than 0.");
            }
        }

        return value;
    }

    // Method 2: Read integer >= minimum
    static int readMinInt(Scanner sc, String prompt, int min) {

        int value = 0;

        while (value < min) {
            System.out.print(prompt);
            value = sc.nextInt();

            if (value < min) {
                System.out.println("Value must be at least " + min + ".");
            }
        }

        return value;
    }

    // Method 3: Calculate split
    static double calculateSplit(double total, int people) {
        return total / people;
    }
}