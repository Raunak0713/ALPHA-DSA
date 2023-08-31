package Arrays;

public class Largest {
    public static void main(String[] args) {
        int[] marks = { 10, 20, 30, 40, 50 };
        int max = marks[0];
        for (int i = 0; i < marks.length; i++) {
            if (max < marks[i]) {
                max = marks[i];
            }
        }
        System.out.println(max);
    }
}
