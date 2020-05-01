package creational.singleton.for_dummies;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HardConcurrentTest {

    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(10);
        List<String> names = IntStream.rangeClosed(1, 10)
            .mapToObj(Integer::toString)
            .collect(Collectors.toList());

        for (String name : names) {
            Worker worker = new Worker(name);
            pool.execute(worker);
        }
    }
}

