package DataTypes.Assignment;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();
        System.out.println(side*side);
        sc.close();
    }
}
