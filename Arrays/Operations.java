package Arrays;
import java.util.*;

public class Operations {
    public static void main(String[] args) {

        //Creation of Array
        int[] marks = new int[10];

        Scanner sc = new Scanner(System.in);
        for(int i=0; i<3; i++){
            marks[i] = sc.nextInt();
        }
        System.out.println(marks[0] + " " + marks[1] + " " + marks[2]);
        System.out.println(marks.length);
        sc.close();
    }
}
