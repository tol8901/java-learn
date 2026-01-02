public class Constructors {
    public static void main(String[] args) {
        Human.description = "Nice";
        Human.getDescription();
    }
}

class Human {
    private String name;
    private int age;
    public static String description;

    public Human(String name, int age) {
        System.out.println("Hello from third constructor!");
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public static void getDescription() {
        System.out.println(description);
    }
}