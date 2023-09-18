package Arrays;

public class Pairs {
    public static void main(String[] args) {
        int[] marks = { 2, 4, 6, 8 ,10 };
        System.out.println();
        pairs(marks);
        System.out.println();
    }

    public static void pairs(int[] marks) {
        int n = marks.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.print("(" + marks[i] + "," + marks[j] + ")  ");
            }
            System.out.println();
        }
    }
}
