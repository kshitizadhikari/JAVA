public class Main
{
    public static void main(String[] args) {

        int age=40;

        if(age==40) {
            System.out.println("I will buy a new house.");
        } else if (age == 60) {
            System.out.println("I will retire.");
        } else {
            System.out.println("I will not buy a old car.");
        }

        switch (age){
            case 40:
                System.out.println("I will buy a new house");
                break;

            case 60:
                System.out.println("I will retire");
                break;


            case 100:
                System.out.println("I will die");
                break;

            default:
                System.out.println("I will beat anjjite");

        }
    }
}