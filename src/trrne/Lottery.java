package trrne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Lottery<TSubject> {
    public static int bst(List<Double> $weights) throws Exception {
        if ($weights.size() <= 0) {
            throw new Exception();
        }

        List<Double> totals = new ArrayList<>($weights.size());
        double total = 0.0;
        for (int i = 0; i < $weights.size(); i++) {
            total += $weights.get(i);
            totals.add(total);
        }

        double rnd = new Random().doubles(0.0, total).findFirst().getAsDouble();
        int bottom = 0, top = totals.size() - 1;
        while (bottom < top) {
            int middle = (bottom + top) / 2;
            if (rnd > totals.get(middle)) {
                bottom = middle + 1;
            } else {
                if (rnd >= (middle > 0 ? totals.get(middle - 1) : 0)) {
                    return middle;
                }
                top = middle;
            }
        }
        return top;
    }

    public static int bst(Double[] $weights) throws Exception {
        return bst(Arrays.asList($weights));
    }

    public static <TSubject> TSubject weighted(LotteryPair<TSubject> $pair) throws Exception {
        if ($pair.size() <= 0) {
            throw new Exception();
        }
        return switch ($pair.size()) {
            case 1 -> $pair.items.get(0);
            default -> $pair.items.get(bst($pair.weights));
        };
    }
}
