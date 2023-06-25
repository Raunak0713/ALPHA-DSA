package ConditionalStatements.Assignment;

import java.util.Scanner;

public class PositiveNegetive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a>0?"positive" : "negative");
        sc.close();
    }
}
