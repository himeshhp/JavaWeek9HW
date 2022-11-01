import java.util.Arrays;

public class Programme_3_ReverseArray {
    public static void main(String[] args) {
        Programme_3_ReverseArray obj = new Programme_3_ReverseArray();
        obj.reverseArray();
    }

    public void reverseArray() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] revArr = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            revArr[arr.length - i - 1] = arr[i];
        }
        System.out.println("Original Array is " + Arrays.toString(arr));
        System.out.println("Reversed Array is " + Arrays.toString(revArr));
    }
}

