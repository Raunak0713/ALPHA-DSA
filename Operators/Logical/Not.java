package Operators.Logical;

public class Not {
    public static void main(String[] args) {
        System.out.println(op(3,4,5));
    }
    public static boolean op(int a,int b, int c){
        return !(a==b && b==c);
    }
}
