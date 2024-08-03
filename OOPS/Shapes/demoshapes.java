import java.util.Scanner;

class box{
    double length, breadth, height;

    box(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length, breadth and height ");
        length = sc.nextDouble();
        breadth = sc.nextDouble();
        height = sc.nextDouble();
        sc.close();
    }
    void SurfaceArea(){
       double area =2*((length*breadth)+(breadth*height)+(height*length));
        System.out.println("Surface Area is " + area);
    }

    void volume(){
        double vol =length*breadth*height;
        System.out.println("Volume is " + vol);
    }
    
}

public class demoshapes {
    public static void main(String[] args) {
        box bx = new box();
        bx.SurfaceArea();
        bx.volume();
    }
}