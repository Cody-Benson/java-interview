import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(1);
        nums.add(3);
        nums.forEach((n)->{System.out.println(n);});

        Collections.sort(nums);
        nums.forEach((n) -> System.out.println(n));
    }   
}