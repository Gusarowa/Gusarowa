package chromosome;

import java.util.Random;

public class Pool {
    private Random random;
    private Evaluator evaluator;
    private Chromosome[] chromosomes;
    private double evaluations[];

    public Pool(int m, int n, Evaluator evaluator) {
        this.random = new Random();
        this.evaluator = evaluator;
        this.chromosomes = new Chromosome[m];
        this.evaluations = new double[n * 2];

        for (int i = 0; i < chromosomes.length; i++) {
            chromosomes[i] = new Chromosome(n);
        }
    }

    public void initialize(int min, int max) {
        for (Chromosome c : chromosomes) {
            c.randomFill(min, max);
        }
    }

    public void step() {
        for (int i = 0; i < chromosomes.length; i++) {
            int j = (i + 1) % chromosomes.length;

            Chromosome ci = chromosomes[i];
            Chromosome cj = chromosomes[j];
            Chromosome cc = ci.crossingover(cj);

            double vi = evaluator.evaluate(ci.getGenes());
            double vc = evaluator.evaluate(cc.getGenes());

            // сохраняем значения оценок на будущее
            evaluations[i * 2] = vi;
            evaluations[i * 2 + 1] = vc;

            if (vc > vi) {
                chromosomes[i] = cc;
            }
        }
    }

    public void mutate(int min, int max) {
        int i = random.nextInt(chromosomes.length);
        chromosomes[i].mutate(min, max);
    }

    public double getMinEval() {
        double min = evaluations[0];

        for (double e : evaluations) {
            min = Math.min(min, e);
        }

        return min;
    }

    public double getMaxEval() {
        double max = evaluations[0];

        for (double e : evaluations) {
            max = Math.max(max, e);
        }

        return max;
    }

    public double getAvgEval() {
        double sum = evaluations[0];

        for (double e : evaluations) {
            sum += e;
        }

        return sum / evaluations.length;
    }

    public Chromosome[] getChromosomes() {
        return chromosomes;
    }
}
