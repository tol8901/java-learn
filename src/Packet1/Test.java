package Packet1;

public class Test extends Person{
    public static void main(String[] args) {
        Person p1 = new Person();
//        p1.name = "Bob";

        System.out.println(p1.name);

        Person p2 = new Person();
        System.out.println(p2.name);

    }

    public Test(){
        name = "Tom";
    }
}
