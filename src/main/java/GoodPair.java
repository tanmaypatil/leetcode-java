import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GoodPair {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> gp = new HashMap<Integer,Integer>();
        for(int i : nums) {
            if(gp.containsKey(i)) {
                gp.put(i,gp.get(i) + 1);
            }
            else {
                gp.put(i,1);
            }
        }
        Set<Map.Entry<Integer,Integer>> all = gp.entrySet();
        int comb = 0;
        for( Map.Entry<Integer,Integer> a : all) {
            int key = a.getKey();
            int val = a.getValue();
            comb +=  (val - 1) * val  /2 ;
        }
        return  comb;
    }
}
