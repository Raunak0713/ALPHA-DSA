package ConditionalStatements;

public class LargerThree {
    public static void main(String[] args) {
        int a = 3;
        int b = 6;
        int c = 7;
        System.out.println((a > b) ? a : b > c ? (a > b) ? a : b : c);
    }
}
