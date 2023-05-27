package Project2HW;

public class shape{


    // Shape interface
    public interface Shape {
        double calculateArea();
        double calculatePerimeter();
    }

    // Circle class implementing Shape interface
    public class Circle implements Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double calculateArea() {
            return Math.PI * radius * radius;
        }

        @Override
        public double calculatePerimeter() {
            return 2 * Math.PI * radius;
        }
    }

    // Square class implementing Shape interface
    public class Square implements Shape {
        private double side;

        public Square(double side) {
            this.side = side;
        }

        @Override
        public double calculateArea() {
            return side * side;
        }

        @Override
        public double calculatePerimeter() {
            return 4 * side;
        }
    }

    // Testing the code
    public class ShapeTest {
        public void main(String[] args) {
            Circle circle = new Circle(5);
            System.out.println("Circle:");
            System.out.println("Area: " + circle.calculateArea());
            System.out.println("Perimeter: " + circle.calculatePerimeter());

            Square square = new Square(7);
            System.out.println("Square:");
            System.out.println("Area: " + square.calculateArea());
            System.out.println("Perimeter: " + square.calculatePerimeter());
        }
    }
}
