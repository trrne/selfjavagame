package trrne;

import java.util.Random;

public class Mathematics {
    public static double Randdouble(double $min, double $max) {
        return new Random().doubles($min, $max).findFirst().getAsDouble();
    }

    public static int Randint(int $min, int $max) {
        return new Random().ints($min, $max).findFirst().getAsInt();
    }

    public static double Abs(double $a) {
        return $a >= 0 ? $a : -$a;
    }

    public static boolean Twins(double $a, double $b, double $offset) {
        return Abs($a - $b) < $offset;
    }

    public static boolean Twins(double $a, double $b) {
        return Twins($a, $b, 1e-3);
    }

    public static double Sign(double $a) {
        return $a >= 0.0 ? 1 : -1;
    }
}
