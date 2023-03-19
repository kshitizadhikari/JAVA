public class Shape {

    int height;
    int width;
    Shape(int h, int w) {
         height = h;
         width = w;
    }
    public void area(){
        int area = height * width;
        System.out.println("Area : " + area);
    }

}
