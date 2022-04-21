package JavaCakes;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] numbers = {0, 6, 4, 3, 9, 7, 8, 5, 2, 3, 1};
        Arrays.sort(numbers);
        String stringNumbers = Arrays.toString(numbers);
        System.out.println(stringNumbers+ " -> ok");
    }
}
