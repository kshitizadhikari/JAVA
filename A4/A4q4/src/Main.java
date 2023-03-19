public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println();
        
        Bird bird = new Bird();
        System.out.println("Bird 1 :");
        bird.fly();
        bird.walk();

        System.out.println();

        Bird bird2 = new Bird();
        System.out.println("Bird 2 :");
        bird2.eat();
    }
}