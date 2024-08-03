
class Calculator {

    int area (int length, int breadth){
        int area= length*breadth;
         return area;
    }

    int area (int side){
         int area= side*side;
         return area;
    }

    double area (double radius){
       double area = Math.PI *radius*radius;
         return area;
    }

    int volume(int length, int breadth, int height) {
        return length * breadth * height;
    }

    int volume(int side) {
        return side * side * side;
    }

    double volume(double radius) {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
}

public class demoMethodOverloading { 

    public static void main(String[] args) {
        Calculator cl = new Calculator();

        int rectangleArea = cl.area(5,6);
        int squareArea = cl.area(7);
        double circleArea = cl.area(5.5);

        int cuboidVolume =cl.volume(5, 6, 7);
        int cubeVolume = cl.volume(7);
        double sphereVolume = cl.volume(5.5);

        System.out.println("Rectangle Area: " + rectangleArea);
        System.out.println("Square Area: " + squareArea);
        System.out.println("Circle Area: " + circleArea);

        System.out.println("Cuboid Volume: " + cuboidVolume);
        System.out.println("Cube Volume: " + cubeVolume);
        System.out.println("Sphere Volume: " + sphereVolume);
    }
}
