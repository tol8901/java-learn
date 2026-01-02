public class Constructors {
    public static void main(String[] args) {
        Human h1 = new Human("Bob", 40);
        Human h2 = new Human("Tom", 30);
        h1.pritnNumberOfPeopele();
        h2.pritnNumberOfPeopele();
        Human h3 = new Human("Rob", 50);
        h1.pritnNumberOfPeopele();
        h2.pritnNumberOfPeopele();
        h3.pritnNumberOfPeopele();


    }
}

class Human {
    private String name;
    private int age;
    private static int countPeople;

    public Human(String name, int age) {
        System.out.println("Hello from third constructor!");
        this.name = name;
        this.age = age;
        countPeople++;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void pritnNumberOfPeopele() {
        System.out.println("Number of people is: " + countPeople);
    }
 }