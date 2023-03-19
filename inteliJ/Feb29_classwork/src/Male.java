public class Male extends Person{

    String gender = "Male";

    Male() {
        this.gender = "male";
    }

    Male(String name, int age) {
        this.name = name;
        this.age = age;
        this.gender = "male";
    }
    public void introduce(){
        System.out.println("\nHi, my name is " + name + ". I am " + age + " years old.");
        System.out.println("I am a " + gender + ".");
    }
}
