package problems;

import chromosome.Chromosome;
import chromosome.Evaluator;
import chromosome.Pool;

import java.util.Random;

public class SubsetSum {
    private int[] weights;
    private Random random;

    public SubsetSum(int n) {
        random = new Random();
        weights = new int[n];
        for (int i = 0; i < n; i++) {
            weights[i] = random.nextInt(1000) + 1; // [1, 1000]
        }
    }

    public SubsetSum(int[] w) {
        weights = w;
    }

    public int[] solve(int m) {
        Evaluator eval = new SubsetSumEvaluator(weights);

        Pool p = new Pool(m, weights.length, eval);

        p.initialize(0, 1);

        for (int i = 0; i < 1000; i++) {
            p.mutate(0, 1);
            p.step();

            System.out.println("Min: " + p.getMinEval() + " Avg: " + p.getAvgEval() + " Max: " + p.getMaxEval());
        }

        Chromosome[] chromosomes = p.getChromosomes();
        Chromosome minCh = chromosomes[0];
        double minEv = eval.evaluate(minCh.getGenes()); // находим хромосому с минимальной оценкой

        for (Chromosome ch : chromosomes) {
            double ev = eval.evaluate(ch.getGenes());

            if (ev < minEv) {
                minCh = ch;
                minEv = ev;
            }
        }

        return minCh.getGenes();
    }

    public int[] getWeights() {
        return weights;
    }
}
