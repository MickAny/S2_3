package hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //1
        List<Double> result = new ArrayList<>(List.of(
                Calculator.sum(29, 3.5),
                Calculator.subtraction(7, 8.5),
                Calculator.divide(29.7,5),
                Calculator.multiply(9, 3.5)
        ));
        result.forEach(a -> System.out.printf("Result: %.2f\n", a));

        System.out.println("-".repeat(50));

        //2
        String[] arr1 = new String[]{"a", "b", "c"};
        String[] arr2 = new String[]{"a", "b", "c"};
        String[] arr3 = new String[]{"a", "d", "c"};

        Integer[] arr4 = new Integer[]{2, 3, 9};
        Integer[] arr5 = new Integer[]{2, 3, 9};

        System.out.println(compareArrays(arr1, arr2));
        System.out.println(compareArrays(arr1, arr3));
        System.out.println(compareArrays(arr4, arr5));

        System.out.println("-".repeat(50));

        //3
        Pair<Integer, String> pair = new Pair<>(12, "Yo");
        System.out.println(pair.getVar1());
        System.out.println(pair.getVar2());
        System.out.println(pair);
    }
    public static <T> boolean compareArrays(T[] arr1, T[] arr2){
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        return Arrays.equals(arr1, arr2);
    }
}

//Написать класс Калькулятор (необобщенный),
// который содержит обобщенные статические методы: sum(), multiply(), divide(), subtract().
// Параметры этих методов – два числа разного типа, над которыми должна быть произведена операция.

//Напишите обобщенный метод compareArrays(),
// который принимает два массива и возвращает true, если они одинаковые, и false в противном случае.
// Массивы могут быть любого типа данных, но должны иметь одинаковую длину и содержать элементы одного
// типа по парно по индексам. То есть тип элемента в первом массиве под нулевым индексом такой же как тип
// элемента во втором массиве под нулевым индексом (и под всеми остальными индексами аналогично)

//Напишите обобщенный класс Pair, который представляет собой пару значений разного типа.
// Класс должен иметь методы getFirst(), getSecond() для получения значений каждого из составляющих пары,
// а также переопределение метода toString(), возвращающее строковое представление пары.
