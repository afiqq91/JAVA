public class Transaction {

    private String description;
    private double amount;
    private String category;

    public Transaction(String description, double amount, String category) {

        // Check description
        if (description == null || description.isEmpty()) {
            throw new IllegalArgumentException("Description cannot be empty");
        }

        // Check amount
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }

        this.description = description;
        this.amount = amount;
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    }
}