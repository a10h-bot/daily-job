import static JobThisMonth.Interval.start;
import static JobThisMonth.Interval.end;
import java.util.Arrays;
import java.util.Comparator;

public class meetingRoom {

  public static void main(String[] args) {

  }

  public static boolean canAttendMeetings(Interval[] intervals) {
    Arrays.sort(intervals, new Comparator<Interval>() {
      public int compare(Interval a, Interval b) {
        return start - start;
      }
    });

    for (int i = 0; i < intervals.length - 1; i++) {
      if (intervals[i].end > intervals[i + 1].start) {
        return false;
      }
    }

    return true;
  }
}

class Interval {
  static int start;
  static int end;
}