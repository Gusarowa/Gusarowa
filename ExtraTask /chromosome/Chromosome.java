package chromosome;

import java.util.Random;

public class Chromosome {
    private int[] genes;
    private Random random;

    public Chromosome(int n) {
        genes = new int[n];
        random = new Random();
    }

    public void randomFill(int min, int max) {
        for (int i = 0; i < genes.length; i++) {
            genes[i] = random.nextInt(max - min + 1) + min;
        }
    }

    public Chromosome crossingover(Chromosome other){
        int k = random.nextInt(genes.length);

        Chromosome result = new Chromosome(genes.length);

        for (int i = 0; i < k; i++) {
            result.genes[i] = this.genes[i];
        }

        for (int i = k; i < genes.length; i++) {
            result.genes[i] = other.genes[i];
        }

        return result;
    }

    public void mutate(int min,int max){
        int k = random.nextInt(genes.length);
        genes[k] = random.nextInt(max - min + 1) + min;
    }

    public int[] getGenes() {
        return genes;
    }
}
