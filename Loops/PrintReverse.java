package Loops;

public class PrintReverse {
    public static void main(String[] args) {
        int n = 12345;
        while(n>0){
            System.out.print(n%10);
            n /= 10;
        }
    }
}
