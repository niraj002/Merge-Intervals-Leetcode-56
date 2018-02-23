# Merge-Intervals-Leetcode-56
Given a collection of intervals, merge all overlapping intervals.  For example, Given [1,3],[2,6],[8,10],[15,18], return [1,6],[8,10],[15,18]
Solution: 
First sort the list according to the starting time of each interval of the list
Next find the overlapping intervals in the sorted list and club them into one.
If there is no overlap then add the interval into the final list of the intervlas and in the end return this final list
The solution runs in linear time and linear space complexity. 
Any improvements on the solution or improvement of documentation is more than welcomed.
