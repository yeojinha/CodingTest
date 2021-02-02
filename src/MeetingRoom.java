import java.util.Arrays;
import java.util.List;

class Interval{
    int start;
    int end;
    Interval(int s, int e)
    {
        this.start=s;
        this.end=e;
    }
}
public class MeetingRoom {
    public static void main(String [] args)
    {
        /*
        Input: [[0,30],[5,10],[15,20]];
        Output: false;

        Input: [[7,10], [2,4]]
        Output: true;
         */
       Interval in1 = new Interval(2, 4);
        Interval in2 = new Interval(7, 10);
        //Interval in3 = new Interval(0, 30);

        Interval[] intervals = { in1, in2,};
        System.out.print(solve(intervals));

    }

    public static Boolean solve(Interval[] intervals)
    {
        if(intervals==null)
        {
            return false;
        }
        Arrays.sort(intervals,(a,b)->a.start-b.start);
        print(intervals);
        for(int i=1;i< intervals.length;i++){
            if(intervals[i-1].end>intervals[i].start)
                return false;
        }
        return true;
    }

    public static void print(Interval[] intervals)
    {
        for(Interval arg: intervals)
        {
            System.out.println(arg.start + " " + arg.end);
        }
    }


}
