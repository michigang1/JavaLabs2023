import java.util.*;
import java.util.concurrent.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.text.NumberFormat;

public class ParallelMonteCarloPi {
    private static final long ITERATIONS = 1_000_000_000L;

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        int threads;
        double startTime, endTime, totalTime;

        try(Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of threads: ");
            if (scanner.hasNextInt()) {
                threads = scanner.nextInt();
            } else {
                throw new InputMismatchException("Expected the input to be an integer number.");
            }
        }

        ExecutorService executor = Executors.newFixedThreadPool(threads);
        List<Future<Double>> futures = new ArrayList<>();

        startTime = (double) System.nanoTime() / 1000000F;

        for (int i = 0; i < threads; i++) {
            futures.add(executor.submit(ParallelMonteCarloPi::estimatePi));
        }

        double sum = 0;
        for (Future<Double> future : futures) {
            sum += future.get();
        }

        executor.shutdown();

        double pi = sum / threads;

        endTime = (double) System.nanoTime() / 1000000F;
        totalTime = endTime - startTime;

        System.out.println("PI is " + pi);
        System.out.println("THREADS " + threads);
        System.out.println("ITERATIONS " + NumberFormat.getNumberInstance().format(ITERATIONS));
        System.out.println("TIME " + String.format("%.2f", totalTime) + "ms");
    }

    private static double estimatePi() {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        int insideCircle = 0;
        for (int i = 0; i < ITERATIONS; i++) {
            double x = random.nextDouble();
            double y = random.nextDouble();
            if (x * x + y * y <= 1) {
                insideCircle++;
            }
        }
        return 4.0 * insideCircle / ITERATIONS;
    }
}