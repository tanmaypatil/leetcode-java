import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GoodPairTest {

    @Test
    void test1() {
        GoodPair  g = new GoodPair();
        int[] a = {1,2,3,1,1,3};
        int x = g.numIdenticalPairs(a);
        assertEquals(4,x);
    }
    @Test
    void test2() {
        GoodPair  g = new GoodPair();
        int[] a = {1,1,1,1};
        int x = g.numIdenticalPairs(a);
        assertEquals(6,x);
    }
    @Test
    void test3() {
        GoodPair  g = new GoodPair();
        int[] a = {1,2,3};
        int x = g.numIdenticalPairs(a);
        assertEquals(0,x);
    }
}
