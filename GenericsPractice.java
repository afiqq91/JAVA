import java.util.ArrayList;
import java.util.List;

public class GenericsPractice {

    public static void main(String[] args) {

        // Create generic lists
        List<String> names = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();
        List<Double> prices = new ArrayList<>();

        // Add values to names
        names.add("Alif");
        names.add("Aminah");
        names.add("Aishah");

        // Add values to numbers
        numbers.add(20);
        numbers.add(10);
        numbers.add(100);

        // Add values to prices
        prices.add(5.99);
        prices.add(12.50);
        prices.add(3.75);

        // Print names
        System.out.println("Names:");
        for (String name : names) {
            System.out.println(name);
        }

        // Print numbers
        System.out.println("\nNumbers:");
        for (Integer num : numbers) {
            System.out.println(num);
        }

        // Print prices
        System.out.println("\nPrices:");
        for (Double price : prices) {
            System.out.println(price);
        }

        // Calculate total of numbers list
        int total = 0;
        for (Integer num : numbers) {
            total += num;
        }

        System.out.println("\nTotal of numbers: " + total);
    }
}