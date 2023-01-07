package Task4;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main1 {
    public static void main(String[] args) {

        List<String> result = new ArrayList<>();
        List<Future<String>> futures = new ArrayList<>();
        ExecutorService service = Executors.newFixedThreadPool(4);

        try {
            futures.add(service.submit(new SomeClass(4)));
            futures.add(service.submit(new SomeClass(12)));
            futures.add(service.submit(new SomeClass(8)));
            futures.add(service.submit(new SomeClass(16)));

            for (Future<String> future : futures) {
                result.add(future.get());
            }
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        } finally {
            service.shutdown();
        }

        for (String s : result) {
            System.out.println(s);
        }
    }
}

class SomeClass implements Callable<String> {
    int count = 0;
    public SomeClass(int count) {
        this.count = count;
    }

    @Override
    public String call() throws Exception {
        for (int i = 0; i < 10; i++) {
            count += i;
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        return String.format("SomeMethod: %s", count);
    }
}
