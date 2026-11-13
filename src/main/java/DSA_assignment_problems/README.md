# DSA Assignment Problems — Week 10

Five Java solutions are provided in this folder.

| File | Approach | Time | Extra space |
|---|---|---:|---:|
| SecondBestScore.java | One pass with highest and second-highest distinct values; no sorting | O(n) | O(1) |
| ExamScoreBandCounter.java | Lower bound for first value >= low; upper bound for first value > high; subtract positions | O(log n) | O(1) |
| DutyRosterRotation.java | Place each name at (index + k % n) % n | O(n) | O(n) |
| ClassAttendanceTracker.java | One pass counting present days and tracking current/longest streak | O(n) | O(1) auxiliary |
| BusiestBusRow.java | Sum each row and keep the first row with the maximum total | O(r*c) | O(1) auxiliary |

## Notes
- **Second-best score:** duplicates of the highest score are ignored. Sorting first takes O(n log n) time; the one-pass solution is O(n).
- **Exam score band:** duplicates at both boundaries are included by using lower bound (first score >= low) and upper bound (first score > high). A linear scan is O(n); binary searches are O(log n).
- **Roster rotation:** reducing k with k % n prevents unnecessary full rotations. Rotating one place at a time k times can take O(n*k).
- **Attendance:** present count and longest streak are both computed in a single pass.
- **Busiest bus row:** update the best row only when a total is strictly larger so ties keep the smaller row index.
