import java.util.List;

public class BudgetService {

    public double calculateTotal(List<Transaction> transactions) {

        double total = 0;

        for (Transaction t : transactions) {
            total += t.getAmount();
        }

        return total;
    }

    // Exercise 4 method
    public double findHighestTransaction(List<Transaction> transactions) {

        double maxAmount = 0;

        for (Transaction t : transactions) {

            if (t.getAmount() > maxAmount) {
                maxAmount = t.getAmount();
            }

        }

        return maxAmount;
    }
}