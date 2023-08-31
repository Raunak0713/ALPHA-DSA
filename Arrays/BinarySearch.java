package Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] marks = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int key = 70;
        int result = binarySearch(marks, key, 0, marks.length - 1);
        if (result != -1) {
            System.out.println("Key found at index: " + result);
        } else {
            System.out.println("Key not found in the array.");
        }
    }

    public static int binarySearch(int[] marks, int key, int start, int end) {
        if (start <= end) {
            int mid = start + (end - start) / 2;
            if (marks[mid] == key) {
                return mid;
            } else if (marks[mid] < key) {
                return binarySearch(marks, key, mid + 1, end);
            } else {
                return binarySearch(marks, key, start, mid - 1);
            }
        }
        return -1; // Key not found
    }
}
