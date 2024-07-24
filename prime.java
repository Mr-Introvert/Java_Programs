import java.util.*;
public class prime {
    static void isPrime(int num){
        int count = 0;
        for(int i = 1; i<=(int)Math.sqrt(num);i++){  //by default Math.sqrt returns double
            if (num%i == 0){                    
                count++;
            }
        }
        if (count == 0){
            System.out.printf("%d is prime", num);
        }
        else {
            System.out.printf("%d is not prime", num);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check prime or not");     
        int num = sc.nextInt();
        isPrime(num);
        sc.close();

    }
}
