package trrne;

import java.util.Random;

public class Lottery {
    public static int Weighted(double... $weights) {
        if ($weights.length <= 0) {
            return -1;
        }

        double[] totals = new double[$weights.length];
        double total = 0;
        for (int i = 0; i < $weights.length; i++) {
            total += $weights[i];
            totals[i] = total;
        }

        double random = new Random().doubles(0, total).findFirst().getAsDouble();
        int min = 0, max = totals.length - 1;
        while (min < max) {
            int center = (min + max) / 2;
            if (random > totals[center]) {
                min = center + 1;
            } else {
                if (random >= (center > 0 ? totals[center - 1] : 0)) {
                    return center;
                }
                max = center;
            }
        }
        return max;
    }

    static int _Weighted(Double[] tSubjects) {
        double[] weights = new double[tSubjects.length];
        for (int i = 0; i < weights.length; i++) {
            weights[i] = tSubjects[i];
        }
        return Weighted(weights);
    }

    public static <TSubject> TSubject Weighted(LotteryPair<TSubject> $pairs) {
        return switch ($pairs.Size()) {
            case 0 -> null;
            case 1 -> $pairs.Subject(0);
            default -> $pairs.Subject(_Weighted($pairs.Weight()));
        };
    }
}
