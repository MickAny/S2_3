package hw;

public class Calculator {
    public static <T extends Number, V extends Number> double sum(T v1, V v2){
        return v1.doubleValue() + v2.doubleValue();
    }
    public static <T extends Number, V extends Number> double multiply(T a, V b) {
        return a.doubleValue() * b.doubleValue();
    }
    public static <T extends Number, V extends Number> double subtraction(T a, V b) {
        return a.doubleValue() - b.doubleValue();
    }
    public static <T extends Number, V extends Number> double divide(T a, V b) {
        return a.doubleValue() / b.doubleValue();
    }
}
