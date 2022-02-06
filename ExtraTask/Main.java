import chromosome.Chromosome;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n = 10;

        Chromosome a = new Chromosome(n);
        Chromosome b = new Chromosome(n);

        a.randomFill(1, 5);
        b.randomFill(6, 10);

        System.out.println(Arrays.toString(a.getGenes()));
        System.out.println(Arrays.toString(b.getGenes()));

        Chromosome c = a.crossingover(b);

        System.out.println(Arrays.toString(c.getGenes()));

        c.mutate(100, 200);
        c.mutate(100, 200);
        c.mutate(100, 200);

        System.out.println(Arrays.toString(c.getGenes()));
    }
}
