import java.util.Scanner;

public class BudgetSplitter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double total = 0;
        int people = 0;

        // Step 1 — Read Total (must be > 0)
        while (total <= 0) {
            System.out.print("Enter total budget: ");
            total = input.nextDouble();

            if (total <= 0) {
                System.out.println("Invalid amount. Total must be greater than 0.");
            }
        }

        // Step 2 — Read People (must be >= 1)
        while (people < 1) {
            System.out.print("Enter number of people: ");
            people = input.nextInt();

            if (people < 1) {
                System.out.println("Invalid number. People must be at least 1.");
            }
        }

        // Step 3 — Compute split
        double split = total / people;

        // Print result with 2 decimal places
        System.out.println(
            "Total: " + String.format("%.2f", total) +
            " | People: " + people +
            " | Each pays: " + String.format("%.2f", split)
        );

        input.close();
    }
}