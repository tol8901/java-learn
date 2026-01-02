public class Constructors {
    public static void main(String[] args) {
        Human h1 = new Human("Bob", 30);
        h1.setName("Tom");

    }
}

class Human {
    private String name;
    private int age;

    public Human() {
        System.out.println("Hello from first constructor!");
        this.name = "default name";
        this.age = 0;
    }

    public Human(String name) {
        System.out.println("Hello from second constructor!");
        this.name = name;
    }

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
}