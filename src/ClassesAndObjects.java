public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setNameAndAge("Roman", 20);
        int year1 = person1.calculateYearsToRetirement();
        person1.speak();

        Person person2 = new Person();
        String s1 = "Vova";
        person2.setNameAndAge(s1, 30);
        int year2 = person2.calculateYearsToRetirement();
        person2.speak();
    }
}

class Person {
    String name;
    int age;

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
