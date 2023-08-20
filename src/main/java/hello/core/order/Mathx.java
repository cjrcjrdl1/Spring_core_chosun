package hello.core.order;

import java.util.Arrays;
import java.util.Iterator;
import java.util.function.BiFunction;
import java.util.function.DoubleBinaryOperator;
import java.util.function.Predicate;

public class Mathx {

    public static <E, R> R reduce(Predicate<E> predicate, BiFunction<R, E, R> binaryFunction,
                                  R init, Iterator<E> iterator) {
        R result = init;
        while (iterator.hasNext())
            if (predicate.test(iterator.next()))
                result = binaryFunction.apply(result, iterator.next());
        return result;
    }

    public static <E, R> R reduce(BiFunction<R, E, R> binaryFunction, R init,
                                  Iterator<E> iterator) {
        R result = init;
        while (iterator.hasNext()) {
            result = binaryFunction.apply(result, iterator.next());
        }
        return result;
    }

    public static double reduce(DoubleBinaryOperator binaryOperator, double init,
                                double... numbers) {
        Iterator<Double> iterator = new Iterator<>() {
            private int index = 0;

            public boolean hasNext() {
                return index < numbers.length;
            }

            public Double next() {
                return numbers[index++];
            }
        };
        return reduce((x, y) -> binaryOperator.applyAsDouble(x.doubleValue(), y.doubleValue()),
                Double.valueOf(init), iterator);
    }

    public static double product(double... numbers) {
        return reduce((x, y) -> x * y, 1.0, Arrays.stream(numbers).iterator());
    }

    public static double sum(double... numbers) {
        return reduce((x, y) -> x + y, 0.0, Arrays.stream(numbers).iterator());
    }

    public static long sum(Range range) {
        final var max = range.max();
        final var min = range.min();
        return (max - min + 1) * (max + min) / 2;
    }
}