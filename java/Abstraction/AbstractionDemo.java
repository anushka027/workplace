package Abstraction;

public class AbstractionDemo {
    public static void main (String args[]){
        Figure circle = new Circle();
        circle.dimensions(20);
        circle.draw();
        circle.resize();

        Figure rectangle = new Rectangle();
        rectangle.dimensions(40);
        rectangle.draw();
        rectangle.resize();
        
    }
}
