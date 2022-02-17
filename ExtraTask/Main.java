import chromosome.AverageEvaluator;
import chromosome.Chromosome;
import chromosome.Pool;
import problems.SubsetSum;

import java.util.Arrays;

public class Main {
    public static void task1() {
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

    public static void task2() {
        int n = 3;
        int m = 3;

        Pool p = new Pool(n, m, new AverageEvaluator());

        p.initialize(1, 10);

        Chromosome[] c = p.getChromosomes();

        for (Chromosome ci : c) {
            System.out.println(Arrays.toString(ci.getGenes()));
        }

        int numSteps = n * m;

        for (int i = 1; i <= numSteps; i++) {
            System.out.println("Step " + i);

            p.step();

            for (Chromosome ci : c) {
                System.out.println(Arrays.toString(ci.getGenes()));
            }
        }

        for (int i = 1; i <= numSteps; i++) {
            System.out.println("Mutate step " + i);

            p.mutate(10, 20);

            for (Chromosome ci : c) {
                System.out.println(Arrays.toString(ci.getGenes()));
            }
        }

        for (int i = 1; i <= numSteps; i++) {
            System.out.println("New step " + i);

            p.step();

            for (Chromosome ci : c) {
                System.out.println(Arrays.toString(ci.getGenes()));
            }
        }
    }

    public static void task3() {
        SubsetSum ss = new SubsetSum(10);
        System.out.println(Arrays.toString(ss.solve(10)));
        System.out.println(Arrays.toString(ss.getWeights()));
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
}
