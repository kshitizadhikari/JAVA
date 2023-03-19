public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Person person1 = new Person();
        person1.introduce();

        Person person2 = new Person("Invoker", 23);
        person2.introduce();

        Male male1 = new Male();
        male1.introduce();
        Male male2 = new Male("Anjite", 23);
        male2.introduce();

        Female female1 = new Female();
        female1.introduce();
        Female female2 = new Female("Sita", 67);
        female2.introduce();

        Gender gender1 = new Gender("Ujwal", 23, "Female");
        gender1.introduce();
    }
}