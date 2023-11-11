package trrne;

import java.util.ArrayList;
import java.util.List;

public class LotteryPair<TSubject, TWeight> {
    List<TSubject> subjects = new ArrayList<TSubject>();
    List<TWeight> weights = new ArrayList<TWeight>();

    public LotteryPair(Pair<TSubject, TWeight>... $pairs) {
        for (int i = 0; i < $pairs.length; i++) {
            subjects.add($pairs[i].subject);
            weights.add($pairs[i].weight);
        }
    }

    public int Size() {
        return subjects.size();
    }

    public TSubject[] Subject() {
        return (TSubject[]) subjects.toArray();
    }

    public TSubject Subject(int index) {
        return subjects.get(index);
    }

    public TWeight[] Weight() {
        return (TWeight[]) weights.toArray();
    }

    public TWeight Weight(int index) {
        return weights.get(index);
    }
}
