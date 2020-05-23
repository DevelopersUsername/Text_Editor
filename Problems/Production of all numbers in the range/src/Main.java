import java.util.function.*;


class Operator {

    public static LongBinaryOperator binaryOperator = (x, y) -> {

        if (x == y) {
            return x;
        } else {
            long product = x;
            for (long i = x + 1; i <= y; i++) {
                product *= i;
            }
            return product;
        }
    };
}