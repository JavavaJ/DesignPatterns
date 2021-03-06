package behavioral.command.for_dummies.utils;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LimitedQueueTest {

    @Test
    public void testLimitedQueue() {
        LimitedQueue<String> limitedQueue = new LimitedQueue<>(3);
        limitedQueue.add("one");
        limitedQueue.add("two");
        limitedQueue.add("three");
        limitedQueue.add("four");
        limitedQueue.add("five");

        System.out.println(limitedQueue);
        System.out.println("Last: " + limitedQueue.getLast());

        assertEquals(3, limitedQueue.size());
        assertEquals("five", limitedQueue.get(2));
        assertEquals("five", limitedQueue.getLast());
    }

}