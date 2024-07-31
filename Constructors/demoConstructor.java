package Constructors;

import java.util.Scanner;

class box{
    int length, breadth, height;
    
    public box(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter L,B,H ");
        length = sc.nextInt();
        breadth = sc.nextInt();
        height = sc.nextInt();
    }
    public box(int l, int b, int h){
        length = l;
        breadth = b;
        height = h;
    }
    void volume(){
        int vol = length*breadth*height;
        System.out.println("Volume is " + vol);
    }
    
}
public class demoConstructor{
    public static void main(String[] args) {
        box bx1 = new box();
        box bx2 = new box(4,6,7);
        bx1.volume();
        bx2.volume();
    }

}
 