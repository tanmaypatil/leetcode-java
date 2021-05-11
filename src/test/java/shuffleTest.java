import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class shuffleTest {

    @Test
    void test1() {
        Shuffle  s = new Shuffle();
        int[] a = { 1,2,3,4};
        int[] x = s.shuffle(a,2);
        int[] b = {1,3,2,4};
        assertArrayEquals(b,x);
    }

    @Test
    void test2() {
        Shuffle  s = new Shuffle();
        int[] a = { 2,5,1,3,4,7};
        int[] x = s.shuffle(a,3);
        int[] b = {2,3,5,4,1,7};
        assertArrayEquals(b,x);
    }

    @Test
    void test3() {
        Shuffle  s = new Shuffle();
        int[] a = {1,1,2,2};
        int[] x = s.shuffle(a,2);
        int[] b = {1,2,1,2};
        assertArrayEquals(b,x);
    }

    @Test
    void test4() {
        Shuffle  s = new Shuffle();
        int[] a = {1,2};
        int[] x = s.shuffle(a,1);
        int[] b = {1,2};
        assertArrayEquals(b,x);
    }
}
