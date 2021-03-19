import java.util.ArrayList;
import java.util.Collections;

public class Rectangle implements Comparable<Rectangle>{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area(){
        return width * height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int compareTo(Rectangle rect){
        if(this.area() > rect.area()){
            return 1;
        }
        else if(this.area() < rect.area()){
            return -1;
        }
        else{
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Rectangle: " +
                "Width= " + width +
                ", Height= " + height;
    }
}
class Main2{
    public static void main(String[] args) {
        ArrayList<Rectangle> rectangles= new ArrayList<>();
        rectangles.add(new Rectangle(4,5));
        rectangles.add(new Rectangle(2,3));
        rectangles.add(new Rectangle(1,8));
        rectangles.add(new Rectangle(9,10));
        rectangles.add(new Rectangle(12,15));

        Collections.sort(rectangles);
        rectangles.forEach(e -> System.out.println(e.area()));

    }
}
