public class Female extends Person{
    String gender = "Female";

    Female(){
        this.gender = "female";
    }

    Female(String name, int age) {
        this.name = name;
        this.age = age;
        this.gender = "gender";
    }

    public void introduce() {
        System.out.println("\nHi, my name is " + name + ".");
        System.out.println("I am a " + gender + ".");
    }
}
