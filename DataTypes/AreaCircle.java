package DataTypes;

import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float rad = sc.nextInt();
        System.out.println(3.14f*rad*rad);
        sc.close();
    }
}
