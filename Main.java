public class Main {
    public static void main(String[] args) {
        System.out.println("This is a shape class.");
        Shape shape1 = new Circle();
        shape1.draw();
        Shape shape2 = new Rectangle();
        shape2.draw();
        Shape shape3 = new Triangle();  
        shape3.draw();
        Shape shape4 = new Square();    
        shape4.draw();
    }
}
class Shape {
    public void draw() {
        System.out.println("Drawing a shape.");
    }
}
class Circle extends Shape {
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}
class Rectangle extends Shape {
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }
}   
class Triangle extends Shape {
    public void draw() {
        System.out.println("Drawing a triangle.");
    }
}   
class Square extends Shape {
    public void draw() {
        System.out.println("Drawing a square.");
    }
}   