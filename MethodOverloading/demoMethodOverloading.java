
class Calculator {

    static int area (int length, int breadth){
        int area= length*breadth;
         return area;
    }

    static int area (int side){
         int area= side*side;
         return area;
    }

    static double area (double radius){
       double area = Math.PI *radius*radius;
         return area;
    }

    static int volume(int length, int breadth, int height) {
        return length * breadth * height;
    }

    static int volume(int side) {
        return side * side * side;
    }

    static double volume(double radius) {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
}

public class demoMethodOverloading { 

    public static void main(String[] args) {

        int rectangleArea = Calculator.area(5,6);
        int squareArea = Calculator.area(7);
        double circleArea = Calculator.area(5.5);

        int cuboidVolume = Calculator.volume(5, 6, 7);
        int cubeVolume = Calculator.volume(7);
        double sphereVolume = Calculator.volume(5.5);

        System.out.println("Rectangle Area: " + rectangleArea);
        System.out.println("Square Area: " + squareArea);
        System.out.println("Circle Area: " + circleArea);

        System.out.println("Cuboid Volume: " + cuboidVolume);
        System.out.println("Cube Volume: " + cubeVolume);
        System.out.println("Sphere Volume: " + sphereVolume);
    }
}
