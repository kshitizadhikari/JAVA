public class Person {

    String name;
    int age;

    Person() {
        name = "John";
        age = 25;
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void introduce(){
        System.out.println("\nHi, my name is " + name + ". I am " + age + " years old.");
    }
}
