import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeetTest {
    @Test
    void test1() {
        assertEquals (1,1);
    }
    @Test
    void test2() {
        LeetClass l = new LeetClass();
        int x = l.add(1,2);
        assertEquals(3,x);
    }

    @Test
    void test3() {
        int[][] accounts = {{1,5},{7,3},{3,5}};
        CustWealth c = new CustWealth();
        int w = c.maximumWealth(accounts);
        assertEquals(10,w);
    }

    @Test
    void test4() {
        int[][] accounts = {{1,2,3},{3,2,1}};
        CustWealth c = new CustWealth();
        int w = c.maximumWealth(accounts);
        assertEquals(6,w);
    }

    @Test
    void test5() {
        int[][] accounts = null;
        CustWealth c = new CustWealth();
        int w = c.maximumWealth(accounts);
        assertEquals(0,w);
    }




}
