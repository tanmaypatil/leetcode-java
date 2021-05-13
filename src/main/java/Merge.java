import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

//56. Merge Intervals
public class Merge {

    private static class Period {
        int start;
        int end;

        public Period(int start , int end) {
            this.start = start ;
            this.end = end ;
        }

        @Override
        public String toString() {
            return "Period{" +
                    "start=" + start +
                    ", end=" + end +
                    '}';
        }
    }

    public int[][] merge(int[][] intervals) {
        ArrayList<Period> merged = new ArrayList<>();
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] < o2[0]) {
                    return -1;
                }
                else if(o1[0] == o2[0] && o1[1] < o2[1]) {
                    return  -1;
                }
                else if(o1[0] == o2[0] && o1[1] == o2[0] ) {
                    return 0;
                }
                else {
                    return  1;
                }
            }
        });
        int start = intervals[0][0];
        int end = intervals[0][1];
        for (int k = 1; k < intervals.length; k++) {
            if (intervals[k][0] <= end && intervals[k][1] >= end ) {
                end = intervals[k][1];
            }
            else if ( !( intervals[k][0] <= end && intervals[k][1] <end )) {
                merged.add(new Period(start,end));
                start = intervals[k][0];
                end = intervals[k][1];

            }
        }
        merged.add(new Period(start,end));
        System.out.println(" merged "+ merged.toString());

        int[][] out;
        out = new int[merged.size()][2];
        int j = 0;
        for (Period i : merged) {
            out[j][0] = i.start;
            out[j][1] = i.end;
            j++;
        }
        return out;
    }
}
