package trrne;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.lang.Math;

public class Mathematics {
    public static double randd(double $min, double $max) {
        return new Random().doubles($min, $max).findFirst().getAsDouble();
    }

    public static int randi(int $min, int $max) {
        return new Random().ints($min, $max).findFirst().getAsInt();
    }

    public static double absd(double $a) {
        return $a >= 0 ? $a : -$a;
    }

    public static boolean twins(double $a, double $b, double $offset) {
        return absd($a - $b) < $offset;
    }

    public static boolean twins(double $a, double $b) {
        return twins($a, $b, 1e-3);
    }

    public static double signd(double $a) {
        return $a >= 0.0 ? 1 : -1;
    }

    public static List<Integer> eratosthenes(int $n) {
        List<Boolean> flags = new ArrayList<>($n + 1);
        for (int i = 0; i < flags.size(); i++) {
            if (i == 0 || i == 1) {
                flags.set(i, false);
            }
        }

        for (int i = 2; i < (int) Math.pow($n, 0.5); i++) {
            if (flags.get(i)) {
                for (int j = 2 * i; j < $n + 1; j += i) {
                    flags.set(j, false);
                }
            }
        }

        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i < $n + 1; i++) {
            if (flags.get(i)) {
                primes.add(i);
            }
        }
        return primes;
    }
}
