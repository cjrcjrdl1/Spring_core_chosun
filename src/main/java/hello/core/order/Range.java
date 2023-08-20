package hello.core.order;

public class Range {

    private final int min;
    private final int max;

    public Range(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int min() {
        return min;
    }

    public int max() {
        return max;
    }

    public long sum() {
        return (max - min + 1) * (max + min) / 2;
    }
}
