package hello.study;

public class NoneDiscountPolicy extends DefaultDiscountPolicy {
    @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
