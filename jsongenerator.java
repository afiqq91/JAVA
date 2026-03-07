import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Sarah", 22, "Computer Science", new String[]{"Java", "Python"});
        
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File("person.json"), person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Person {
    private String name;
    private int age;
    private String course;
    private String[] skills;
    
    public Person(String name, int age, String course, String[] skills) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.skills = skills;
    }
    
    // Getters and setters
}