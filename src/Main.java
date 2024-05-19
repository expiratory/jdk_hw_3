import calc.Calculator;
import arr.ArrayComparison;
import pair.Pair;

public class Main {
    public static void main(String[] args) {
        Integer a = 3;
        Double b = 3.55;
        String c = "3.55";
        Integer d = 3;

        try {
            System.out.println(Calculator.sum(a, b));
            System.out.println(Calculator.multiply(c, d));
        } catch (exceptions.CalculatorInvalidDataTypeException e) {
            System.out.println(e.getMessage());
        }

        Integer[] arr1 = {1, 2, 3};
        Integer[] arr2 = {1, 2, 3};
        Integer[] arr3 = {1, 2, 4};
        Double[] arr4 = {1.0, 2.0, 5.0};

        System.out.println(ArrayComparison.compareArrays(arr1, arr2));
        System.out.println(ArrayComparison.compareArrays(arr3, arr4));

        Pair<Integer, String> pair1 = new Pair<>(111, "1");
        Pair<Integer, String> pair2 = new Pair<>(2, "222");

        System.out.println(pair1);
        System.out.println(pair2);
    }
}
