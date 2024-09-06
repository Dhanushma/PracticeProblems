package dhanu.study.threads;

import java.util.concurrent.*;

public class ExecutorSample {
    public static void main(String[] args) {


        //Executor to execute a runnable task
        Runnable runnable = () -> {
            System.out.println("job is executed");
        };
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        executorService.execute(runnable);

        //Example for Callable and Future
        Callable<String> callable = () -> {
            return "task completed";
        };

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<String> future = executor.submit(callable);
        try {
            String res = future.get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
