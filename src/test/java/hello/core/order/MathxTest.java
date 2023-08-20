package hello.core.order;

import static org.junit.jupiter.api.Assertions.*;

class MathxTest {

    public static void main(String[] args) {
        MathxTest.sum();
        MathxTest.product();
//        MathxTest.sumWithRange();
    }

//    private static void sumWithRange() {
//        assert Mathx.sum(new Range(0, 0)) == 0;
//        assert Mathx.sum(new Range(0, 10)) == Mathx.sum(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        assert Mathx.sum(new Range(10, 99)) + 100 == Mathx.sum(new Range(10, 100));
//        assert Mathx.sum(new Range(-10, 0)) == -Mathx.sum(new Range(0, 10));
//        assert Mathx.sum(-2, -1, 0, 1, 2) == Mathx.sum(new Range(-2, 2));
//    }


    private static void product() {
        assert Mathx.product() == 1;
        assert Mathx.product(1, 2, 3, 7, 9, 10, 5, 4, 8,
                6) == Mathx.product(1, 2, 3, 4, 5, 6, 7, 8, 9) * 10;
    }

    private static void sum() {
        assert Mathx.sum() == 0;
        assert Mathx.sum(1, 2, 3, 7, 9, 10, 5, 4, 8, 6) == Mathx.sum(1, 2, 3, 4, 5, 6, 7, 8, 9)
                + 10;
    }
}