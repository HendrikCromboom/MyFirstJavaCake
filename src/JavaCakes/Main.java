package JavaCakes;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int[] numbers = {0, 6, 4, 3, 9, 7, 8, 5, 2, 3, 1};
        Arrays.sort(numbers);
        String stringNumbers = Arrays.toString(numbers);
        System.out.println(stringNumbers+ " -> Stringified Array in Java");
        System.out.println("///////////////////////////////////////////////////////////");
        System.out.print("Name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next().trim();
        System.out.println("Good day to you " +name);
        System.out.print("Please provide a whole number: ");
        Scanner scanner2 = new Scanner(System.in);
        int number = scanner2.nextInt();
        int powerOf = number*number;
        System.out.println("The power of " + number + " = " + powerOf );
    }
}
