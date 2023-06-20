package DataTypes;

import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rad = sc.nextInt();
        System.out.println(3.14*rad*rad);
        sc.close();
    }
}
