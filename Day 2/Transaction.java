public class Transaction implements Printable {

    private final String description;
    private final double amount;
    private final String category;

    public Transaction(String description, double amount, String category) {

        if (description == null || description.isEmpty()) {
            throw new IllegalArgumentException("Description cannot be empty");
        }

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

    @Override
    public void print() {
        System.out.println("Description: " + description);
        System.out.println("Amount: " + amount);
        System.out.println("Category: " + category);
        System.out.println();
    }
}