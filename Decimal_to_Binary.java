// part a
import java.util.Scanner;

public class Decimal_to_Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num  = sc.nextInt();

        if (num == 0) {
            System.out.println("Binary: 0");
        }

        String binary = "";
        while (num > 0) {
            binary = (num % 2) + binary;  
            num = num/ 2;
        }
        System.out.println("Binary of " + num + " = " + binary);
        sc.close();
    }
}
    

