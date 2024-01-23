//import java.util.*;

public class Abstraction{
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        System.out.println(rec.area(5, 8));
        rec.changeColor();
        System.out.println(rec.color);

        // Triangle tri = new Triangle();
        // System.out.println(tri.area(4, 5));
    }
}

abstract class GraphicObject{
    int x;
    int y;
    String color;
    int size = 100;
    GraphicObject(){
        color = "White";
        System.out.println("GraphicObject's constructor has been called");
    }
    abstract int area(int x, int y);
} 

class Rectangle extends GraphicObject{
    Rectangle(){
        System.out.println("Rectangle's constructor has been called");
    }
    
    void changeColor(){
        color = "Blue";
    }
    int area(int l , int b){
        return (l*b);
    }
}

// class Triangle extends GraphicObject {
//     int area(int b, int h){
//         return ((int) (0.5*b*h));
//     }
// }