// part b
import java.util.Scanner;

public class Binary_Array_converter {

    public static int[] intToBinaryArray(int number) {
        if (number == 0) 
            return new int[]{0}; //create an array with one element 0 and return it immediately

        int bitCount = 0;
        int temp = number;
        while (temp > 0) { 
            bitCount++; temp /= 2; 
        }

        int[] binaryArray = new int[bitCount];
        for (int i = bitCount - 1; i >= 0; i--) {
            binaryArray[i] = number % 2;
            number /= 2;
        }
        return binaryArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number= sc.nextInt();
        int[] binary = intToBinaryArray(number);

        System.out.print("Binary: ");
        for (int i = 0; i < binary.length; i++) {
        System.out.print(binary[i]);
        }
        sc.close();
    }
}