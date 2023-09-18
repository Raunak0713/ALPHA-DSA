package Arrays;

public class BinarySearch{
    public static void main(String[] args) {
        int[] marks = {10,20,30,40,50,60};
        int key = 50;
        System.out.println(Binary(marks, key));
    }

    public static int Binary(int[] marks, int key){
        int start = 0;
        int end = marks.length - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(marks[mid] == key){
                return mid;
            }
            if(marks[mid] < key){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
}