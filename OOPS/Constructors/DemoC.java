import java.util.Scanner;

class Box{
    int length, breadth, height;
    
    public Box(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter L,B,H ");
        length = sc.nextInt();
        breadth = sc.nextInt();
        height = sc.nextInt();
        sc.close();
    }
    public Box(int l, int b, int h){
        length = l;
        breadth = b;
        height = h;
    }
    void volume(){
        int vol = length*breadth*height;
        System.out.println("Volume is " + vol);
    }
    
}
public class DemoC{
    public static void main(String[] args) {
        Box bx1 = new Box();
        Box bx2 = new Box(4,6,7);
        bx1.volume();
        bx2.volume();
    }

}
 