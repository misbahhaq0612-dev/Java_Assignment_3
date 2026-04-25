// part c
import java.util.Scanner;

public class Binary_string_converter {
    
    public static String intToBinaryString(int num) {
        if (num == 0) {
            return "0";
        }
        
        String binaryStr = "";

        while (num > 0) {
            binaryStr = (num % 2) + binaryStr;
            num = num / 2;
        }
        return binaryStr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter integer to convert to Binary: ");
        int num = sc.nextInt();

        String binary = intToBinaryString(num);

        System.out.print("The binary of " + num + " is " + binary);
        sc.close();
    }
}