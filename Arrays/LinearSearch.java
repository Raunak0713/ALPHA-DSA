package Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] marks = {10, 20, 30, 40, 50};
        System.out.println();
        if(Linear(marks,21) != -1){
            System.out.println("At Position : " + Linear(marks,20));
        }else{
            System.out.println("Key doesnt exist");
        }
        System.out.println();
    }
    public static int Linear(int[] marks, int target){
        for(int i=0;i<marks.length; i++){
            if(marks[i]==target) return i+1;
        }
        return -1;
    }
}
