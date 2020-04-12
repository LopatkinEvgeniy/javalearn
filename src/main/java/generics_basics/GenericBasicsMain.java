package generics_basics;

import java.util.ArrayList;

public class GenericBasicsMain {
    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>();
        ArrayList<Double> doubles = new ArrayList<>();
        ArrayList<Number> numbers = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            ints.add(i);
            doubles.add((double) i + 0.5);

            if (i % 2 == 0) {
                numbers.add(i);
            } else {
                numbers.add((double) i + 0.5);
            }
        }

        System.out.println("ints squares");
        printSquares(ints);

        System.out.println("double squares");
        printSquares(doubles);

        System.out.println("double numbers");
        printSquares(numbers);

        addIntegers(ints);
        addIntegers(numbers);
        // addIntegers(doubles); compile time error

        System.out.println("ints after add");
        printNumbers(ints);

        System.out.println("numbers after add");
        printNumbers(numbers);
    }

    public static void printSquares(ArrayList<? extends Number> list) {
        for (Number elem: list) {
            System.out.println(elem.doubleValue() * elem.doubleValue());
        }
    }

    public static void printNumbers(ArrayList<? extends Number> list) {
        for (Number number : list) {
            System.out.println(number);
        }
    }

    public static void addIntegers(ArrayList<? super Integer> list) {
        list.add(11);
        list.add(22);
        list.add(33);
    }
}
