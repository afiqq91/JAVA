import java.util.Scanner;

public class StudentProfile {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        int age;

                while (true) {
            System.out.print("Enter your age: ");
                age = input.nextInt();

                if (age > 0 && age <= 120) {
                break;
            } else {
            System.out.println("Please enter a valid age.");
    }
}

        input.nextLine(); // clear buffer

        System.out.print("Enter your favourite programming language: ");
        String language = input.nextLine();

        System.out.print("Enter your study hours per week: ");
        double studyHours = input.nextDouble();

        greetStudent(name);

        System.out.println("\n--- Student Profile for Training Centre ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Favourite Language: " + language);
        System.out.println("Study Hours Per Week: " + studyHours);

        displayAdultStatus(age);
        displayStudyHabit(studyHours);

        motivateStudent();

        input.close();
    }

    public static void greetStudent(String name) {
        System.out.println("\nWelcome, " + name + "!");
    }

    public static void displayAdultStatus(int age) {
        if (age >= 18) {
            System.out.println("Status: You're an adult learner.");
        } else {
            System.out.println("Status: You're not an adult yet.");
        }
    }

    public static void displayStudyHabit(double hours) {
        if (hours >= 10) {
            System.out.println("Great study habit!");
        } else {
            System.out.println("Try to spend more time practising.");
        }
    }

    public static void motivateStudent() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Keep learning Java!");
        }
    }
}