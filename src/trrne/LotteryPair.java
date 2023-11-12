package trrne;

import java.util.ArrayList;
import java.util.List;

public class LotteryPair<TSubject> {
    List<TSubject> subjects = new ArrayList<TSubject>();
    List<Double> weights = new ArrayList<Double>();

    public LotteryPair(Pair<TSubject>... $pairs) {
        for (int i = 0; i < $pairs.length; i++) {
            subjects.add($pairs[i].subject);
            weights.add($pairs[i].weight);
        }
    }

    public int Size() {
        return subjects.size();
    }

    @SuppressWarnings("unchecked")
    public TSubject[] Subject() throws ClassCastException {
        if (subjects instanceof List<TSubject>) {
            return (TSubject[]) subjects.toArray();
        }
        throw new ClassCastException("TSubject ??????");
    }

    public TSubject Subject(int index) {
        return subjects.get(index);
    }

    public Double[] Weight() throws ClassCastException {
        if (weights instanceof List<Double>) {
            return (Double[]) weights.toArray();
        }
        throw new ClassCastException();
    }

    public Double Weight(int index) {
        return weights.get(index);
    }

    public final List<Double> Weight2() {
        return weights;
    }

    public final List<TSubject> Subject2() {
        return subjects;
    }
}
