package DataTypes;

public class Pattern {
    public static void main(String[] args) {
        System.out.println();
        for(int i=0; i<4; i++){
            for(int j=0; j<4-i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
