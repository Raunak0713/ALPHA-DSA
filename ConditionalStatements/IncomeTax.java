package ConditionalStatements;

public class IncomeTax {
    public static void main(String[] args) {
        int income = 600000;
        int tax = 0;
        if(income < 500000){
            tax = 0;
        }
        else if(income > 500000 && income < 1000000){
            tax = 20;
        }
        else {
            tax = 30;
        }
        System.out.println("Final Income : " + (income - (income*(tax/100))));
    }
}
