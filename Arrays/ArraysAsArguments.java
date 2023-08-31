package Arrays;
import java.util.*;

public class ArraysAsArguments {
    public static void main(String[] args) {
        int[] marks = new int[3];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<marks.length; i++) {
            marks[i] = sc.nextInt();
        }
        update(marks);
        for(int i=0; i<marks.length; i++) {
            System.out.print(marks[i]+ " ");
        }
        sc.close();
    }

    public static void update(int[] marks){
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }

}
