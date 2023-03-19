public class Main {
    public static void main(String[] args) {

//      string ... is immutable
        String str = "Hello";
        String str2 = str.toUpperCase();
        System.out.println(str);
        System.out.println(str2);

//        STRING BUFFER ... is mutable

        StringBuffer abc = new StringBuffer("What the");
        abc.append(" what");
        System.out.println(abc);
    }
}