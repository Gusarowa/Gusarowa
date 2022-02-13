package chromosome;

// вычисляет среднее арифметическое элементов массива
public class AverageEvaluator implements Evaluator {
    public double evaluate(int[] a) {
        double sum = 0.0;

        for (int i : a) {
            sum += i;
        }

        return sum / a.length;
    }
}
