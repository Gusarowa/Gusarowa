package chromosome;

import java.util.Random;

public class Pool {
    private Random random;
    private Evaluator evaluator;
    private Chromosome[] chromosomes;

    public Pool(int m, int n, Evaluator evaluator) {
        this.random = new Random();
        this.evaluator = evaluator;
        this.chromosomes = new Chromosome[m];

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

            if (vc > vi) {
                chromosomes[i] = cc;
            }
        }
    }

    public void mutate(int min, int max) {
        int i = random.nextInt(chromosomes.length);
        chromosomes[i].mutate(min, max);
    }

    public Chromosome[] getChromosomes() {
        return chromosomes;
    }
}
