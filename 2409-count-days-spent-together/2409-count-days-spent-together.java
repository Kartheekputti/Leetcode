import java.time.LocalDate;

class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int start = Math.max(
            LocalDate.parse("2023-" + arriveAlice).getDayOfYear(),
            LocalDate.parse("2023-" + arriveBob).getDayOfYear()
        );
        int end = Math.min(
            LocalDate.parse("2023-" + leaveAlice).getDayOfYear(),
            LocalDate.parse("2023-" + leaveBob).getDayOfYear()
        );
        return Math.max(0, end - start + 1);
    }
}