public class Partition {
    public int partitionDisjoint(int[] A) {
        int rindex = 0;
        long rMax = A[0];
        long lMax = A[0];
        boolean partitionFound = false;
        for(int i = 1 ; i < A.length; i++) {
            if (A[i] >= rMax && !partitionFound ) {
                lMax = rMax;
                rMax = A[i];
                rindex = i;
                partitionFound = true;
            }
            else if ( partitionFound && (A[i] < lMax) ){
                lMax = rMax;
                rindex = 0;
                partitionFound = false;
            }
            else if ( A[i] > rMax) rMax = A[i];
        }
        return rindex ;
    }
}
