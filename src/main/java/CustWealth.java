public class CustWealth {
    public int maximumWealth(int[][] accounts) {
        if(accounts ==null) return 0;
        int mwealth = 0;
        for(int[] a : accounts){
            int wealth = 0;
            for(int w : a) {
                wealth += w;
            }
            mwealth = wealth > mwealth ? wealth : mwealth;
        }
        return mwealth;
    }
}
