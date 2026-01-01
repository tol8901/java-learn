public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Vova");
        person1.setAge(12);
        System.out.println("Output in the main method: " + person1.getName());
        System.out.println("Output in the main method: " + person1.getAge());
        person1.speak();
    }
}

class Person {
    private String name;
    private int age;

    public void setName(String userName) {
        if (userName.isEmpty()) {
            System.out.println("Empty username!");
        } else {
            name = userName;
        }
    }

    public String getName() {
        return name;
    }

    public void setAge(int userAge) {
        if (userAge < 0) {
            System.out.println("An age should be positive");
        } else {
            age = userAge;
        }

    }

    public int getAge() {
        return age;
    }

    void setNameAndAge(String username, int userage) {
        name = username;
        age = userage;
    }

    int calculateYearsToRetirement() {
        int years = 65 - age;
        return years;
    }

    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("My name is " + name + " I am " + age + " years old.");
        }
    }

    void sayHello() {
        System.out.println("Hello!");
    }


}
