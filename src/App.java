import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import trrne.*;

public class App {
    public static void main(String[] args) throws Exception {
        Tuple<String, Double>[] pairs = new Tuple[] {
                new Tuple<>("R", 1.0),
                new Tuple<>("SR", 3.0),
                new Tuple<>("SSR", 96.0)
        };

        List<String> R = new ArrayList<>();
        List<String> SR = new ArrayList<>();
        List<String> SSR = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            var choice = Lottery.weighted(new LotteryPair<>(Arrays.asList(pairs)));
            if (choice == "R") {
                R.add(choice);
            } else if (choice == "SR") {
                SR.add(choice);
            } else {
                SSR.add(choice);
            }
        }
        System.out.println("R  : " + R.size() + "\nSR : " + SR.size() + "\nSSR: " + SSR.size());
    }
}
