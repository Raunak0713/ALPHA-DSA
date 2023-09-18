package Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] marks = {10,20,30,40,50};
        System.out.println();
        System.out.print("Before Reverse : ");
        for(int i = 0; i < marks.length; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();
        System.out.println();
        System.out.print("After Reverse : ");
        rev(marks);
        System.out.println();
        System.out.println();
    }
    public static void rev(int[] marks) {
        for(int i = 0; i < marks.length/2; i++){
            int temp = marks[i];
            marks[i] = marks[marks.length - i - 1];
            marks[marks.length - i - 1] = temp;
        }
        for(int i = 0; i < marks.length; i++){
            System.out.print(marks[i] + " ");
        }
    }
}
