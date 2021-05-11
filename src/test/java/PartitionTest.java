import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PartitionTest {
    @Test
    void test1() {
       Partition p = new Partition();
       int[] a = { 1 , 5};
       int x = p.partitionDisjoint(a);
       assertEquals(1,x);
    }

    @Test
    void test2() {
        Partition p = new Partition();
        int[] a = {5,0,3,8,6};
        int x = p.partitionDisjoint(a);
        assertEquals(3,x);
    }

    @Test
    void test3() {
        Partition p = new Partition();
        int[] a = {1,1,1,0,6,12};
        int x = p.partitionDisjoint(a);
        assertEquals(4,x);
    }

    @Test
    void test4() {
        Partition p = new Partition();
        int[] a = {1,1,1,0,6,12,5,13,15};
        int x = p.partitionDisjoint(a);
        assertEquals(4,x);
    }

    @Test
    void test5() {
        Partition p = new Partition();
        int[] a = {1,2,3};
        int x = p.partitionDisjoint(a);
        assertEquals(1,x);
    }

    @Test
    void test6() {
        Partition p = new Partition();
        int[] a = {1,1};
        int x = p.partitionDisjoint(a);
        assertEquals(1,x);
    }
    //[24,11,49,80,63,8,61,22,73,85]
    @Test
    void test7() {
        Partition p = new Partition();
        int[] a = {24,11,49,80,63,8,61,22,73,85};
        int x = p.partitionDisjoint(a);
        assertEquals(9,x);
    }
}

