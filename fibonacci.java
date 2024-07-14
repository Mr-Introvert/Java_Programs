package JAVA;
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int prev = 0, cur = 1, next = 0;

        for(int i=0;i<num;i++){
            System.out.print(next);
            next = prev + cur;
            prev = cur;
            cur = next;
        }
    }
    
}
