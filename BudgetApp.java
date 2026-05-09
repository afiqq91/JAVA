import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BudgetApp {

    public static void main(String[] args) {

        List<Transaction> transactions = new ArrayList<>();

        transactions.add(new Transaction("Lunch", 15.00, "Food"));
        transactions.add(new Transaction("Bus Ticket", 3.00, "Transport"));
        transactions.add(new Transaction("Coffee", 15.20, "Food"));
        transactions.add(new Transaction("Movie Ticket", 15.00, "Entertainment"));
        transactions.add(new Transaction("Groceries", 70, "Food"));

        // 1️⃣ Create Map<String, Double>
        Map<String, Double> categoryTotals = new HashMap<>();

        // 2️⃣ Loop through transactions
        for (Transaction t : transactions) {

            String category = t.getCategory();
            double amount = t.getAmount();

            // 3️⃣ & 4️⃣ Add to existing total or create new entry
            double currentTotal = categoryTotals.getOrDefault(category, 0.0);
            categoryTotals.put(category, currentTotal + amount);
        }

        // 5️⃣ Print the map results
        System.out.println("Category Totals:");

        for (Map.Entry<String, Double> entry : categoryTotals.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}