import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;

public class BudgetServiceTest {

    @Test
    void testCalculateTotal() {

        List<Transaction> list = new ArrayList<>();

        list.add(new Transaction("Lunch", 10, "Food"));
        list.add(new Transaction("Bus", 5, "Transport"));

        BudgetService service = new BudgetService();

        assertEquals(15, service.calculateTotal(list));
    }

    @Test
    void testNegativeAmountThrowsException() {

        assertThrows(IllegalArgumentException.class, () -> {
            new Transaction("Invalid", -10, "Food");
        });
    }

    @Test
    void testCategoryTotals() {

        List<Transaction> list = new ArrayList<>();

        list.add(new Transaction("Lunch", 10, "Food"));
        list.add(new Transaction("Coffee", 5, "Food"));

        BudgetService service = new BudgetService();

        Map<String, Double> totals = service.calculateCategoryTotals(list);

        assertEquals(15, totals.get("Food"));
    }
}