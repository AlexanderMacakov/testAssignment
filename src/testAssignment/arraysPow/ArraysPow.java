package testAssignment.arraysPow;

import java.util.ArrayList;
import java.util.List;

public class ArraysPow {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(2);
        integers.add(4);
        integers.add(8);
        integers.add(10);

        for (Integer integer : integers) {
            System.out.println((int) Math.pow(integer, 2));
        }
    }

}
