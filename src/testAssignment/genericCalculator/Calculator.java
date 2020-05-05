package testAssignment.genericCalculator;

class Calculator {

    static <T extends Number> double add(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }
    static <T extends Number> double multiply(T a, T b) {
        return a.doubleValue() * b.doubleValue();
    }
    static <T extends Number> double divide(T a, T b) {
        return a.doubleValue() / b.doubleValue();
    }
    static <T extends Number> double subtract(T a, T b) {
        return a.doubleValue() - b.doubleValue();
    }
}
