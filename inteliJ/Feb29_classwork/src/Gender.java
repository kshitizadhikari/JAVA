public class Gender extends Person{

    String gender;
    Gender(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void introduce() {
        System.out.println("\nName : " + name);
        System.out.println("Age : " + age);
        System.out.println("Gender : " + gender);
    }
}
