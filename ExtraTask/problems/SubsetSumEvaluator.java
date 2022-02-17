package problems;

import chromosome.Evaluator;

public class SubsetSumEvaluator implements Evaluator {
    private int[] weights; // храним веса, чтобы не нарушать устоявшуюся логику програмы
    private double t; // половина суммарного веса

    public SubsetSumEvaluator(int[] w) {
        weights = w;

        for (int i : w) {
            t += i;
        }

        t /= 2;
    }

    public double evaluate(int[] a) {
        double s = 0.0;

        for (int i = 0; i < Math.min(weights.length, a.length); i++) {
            s += a[i] * weights[i];
        } // если a[i] = 0, то не 'берем' предмет, иначе 'берем'

        return 1.0 / ((t - s) * (t - s) + 1);
    }
}
