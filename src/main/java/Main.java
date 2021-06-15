import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello");
    }

    public static int add(int num1, int num2){
        return num1+num2;
    }
    public static int add(int num1, int num2, int num3){
        return num1+add(num2,num3);
    }
    public static int add(int num1, int num2, int num3,int num4){
        return num1+add(num2,num3,num4);
    }
    public static int add(int num1, int num2, int num3,int num4, int num5){
        return num1+add(num2,num3,num4,num5);
    }
    public static int subtract(int num1, int num2){
        return num1-num2;
    }
    public static ArrayList<Integer> desSort(ArrayList<Integer> list){
        Collections.sort(list, Collections.reverseOrder());
        return list;
    }
    // accept array return sorted in desceding order
}
