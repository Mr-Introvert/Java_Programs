import java.util.Scanner;
class Customers{
    static int cus_id;
    String c_name;
    int c_id;

    void info(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter customer name : ");
        c_name = sc.nextLine();
        cus_id ++;
        c_id = cus_id;
        sc.close();
    }
    void display(){
        System.out.println("Customer ID " + c_id);
        System.out.println("Customer Name " + c_name);
    }
}
public class main{
    public static void main(String[] args) {
        Customers cs = new Customers();
        cs.info();
        cs.display();
    }
}
