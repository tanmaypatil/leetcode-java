public class Shuffle {
    public int[] shuffle(int[] nums, int n) {
        int []s = new int[n];
        for(int i =0 ; i < n/2 ; i++) {
            s[i] = nums[i];
            s[i+1] = nums[n/2+i];
        }
        return s;

    }
}
