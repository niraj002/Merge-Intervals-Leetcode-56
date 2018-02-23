
 // Definition for an interval.
  public class Interval {
      int start;
      int end;
      Interval() { start = 0; end = 0; }
      Interval(int s, int e) { start = s; end = e; }
  }
 
class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> ans = new ArrayList<Interval>();
        intervals.sort((p1, p2) -> Integer.compare(p1.start, p2.start));
        if(intervals.size()==0)
            return ans;
        int startTime= intervals.get(0).start;
        int endTime  = intervals.get(0).end;
        for(Interval i : intervals){
            if(i.start<=endTime){
                endTime=Math.max(endTime,i.end);
            }
            else{
                Interval temp = new Interval(startTime, endTime);
                ans.add(temp);
                startTime=i.start;
                endTime=i.end;
            }
        }
        ans.add(new Interval(startTime,endTime));
        return ans;
    }
}
