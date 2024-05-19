package calc;

import exceptions.CalculatorInvalidDataTypeException;

public class Calculator {
    public static <T> Object sum(T a, T b) throws CalculatorInvalidDataTypeException {
        if (a instanceof Number && b instanceof Number) {
            return ((Number) a).doubleValue() + ((Number) b).doubleValue();
        }
        throw getInvalidDataTypeException();
    }

    public static <T> Object substract(T a, T b) throws CalculatorInvalidDataTypeException {
        if (a instanceof Number && b instanceof Number) {
            return ((Number) a).doubleValue() - ((Number) b).doubleValue();
        }
        throw getInvalidDataTypeException();
    }

    public static <T> Object multiply(T a, T b) throws CalculatorInvalidDataTypeException {
        if (a instanceof Number && b instanceof Number) {
            return ((Number) a).doubleValue() * ((Number) b).doubleValue();
        }
        throw getInvalidDataTypeException();
    }

    public static <T> Object divide(T a, T b) throws CalculatorInvalidDataTypeException {
        if (a instanceof Number && b instanceof Number) {
            return ((Number) a).doubleValue() / ((Number) b).doubleValue();
        }
        throw getInvalidDataTypeException();
    }

    private static CalculatorInvalidDataTypeException getInvalidDataTypeException() {
        return new CalculatorInvalidDataTypeException("Нельзя передавать в функцию любые типы, кроме числового");
    }
}
