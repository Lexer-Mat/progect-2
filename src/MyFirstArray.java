import java.util.Arrays;

import static java.util.Arrays.sort;

public class MyFirstArray {
    public static void main(String[] args) {
        int[] myArray = {1, 4, 5, 8, 3, 2};
        System.out.println(myArray);
        System.out.println(Arrays.toString(myArray));
        Arrays.sort(myArray);
        System.out.println(Arrays.toString(myArray));
        int key = Arrays.binarySearch(myArray, 5);
        System.out.println(key);
        System.out.println(Arrays.binarySearch(myArray, 0));
    }
}
