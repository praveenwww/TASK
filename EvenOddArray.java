import java.util.*;
public class EvenOddArray {
    public static void main(String[] args) {
       
        int[] numbers = {10, 19, 22, 37, 48, 59, 61, 67, 99};

        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.println(num + " is even");
            } else {
                System.out.println(num + " is odd");
            }
        }
    }
}
