package ConditionalStatements.Assignment;

public class Leap {
    public static void main(String[] args) {
        int a = 1492;
        if(a%4==0 || a%100==0 || a%400==0){
            System.out.println("Leap");
        }
        else{
            System.out.println("Not a leap");
        }
    }
}
