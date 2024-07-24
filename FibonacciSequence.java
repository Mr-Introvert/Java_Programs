import java.util.Scanner;
public class FibonacciSequence{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int prev = 0, cur = 1, next = 0;
        if(num<0){
            System.out.println("Invalid Input");
        }
        else{
            for(int i= 0; i<num;i++){
                System.out.println(next);
                prev = cur;
                cur = next;
                next = prev + cur;
            
            }
            System.out.printf("Here are %d numbers from the fibonacci sequence",num);
        }
        sc.close();
    }
}
