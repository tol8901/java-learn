public class Constructors {
    public static void main(String[] args) {

        Human h1 = new Human("Bob", 40);
        Human h2 = new Human("Tom", 30)
        Human.description = "Nice";
        h1.getAllFields();
        h2.getAllFields();
        Human.description = "Bad";
        h1.getAllFields();
        h2.getAllFields();

        System.out.println(Math.pow(2, 4));
        System.out.println(Math.PI);

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

    public void getAllFields() {
        System.out.println(name + ", " + age + ", " + description);
    }

    public static void printAllFields() {
        System.out.println();
    }
}