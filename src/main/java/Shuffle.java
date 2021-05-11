public class Shuffle {
    public int[] shuffle(int[] nums, int n) {
        int []s = new int[2 * n];
        for(int i =0 ; i < n ; i++) {
            s[i*2 ] = nums[i];
            s[i*2 + 1 ] = nums[n+i];
        }
        return s;

    }
}
