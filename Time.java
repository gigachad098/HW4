public class Time {
    public static int timenow;
    Time() {
    }
    public static void incrementTime() {
        int minute = timenow%10;
        int hour = timenow/10;
        if (minute == 59) {
            hour++;
            minute = 0;
        }
        else {
            minute++;
        }
    }
    public int getTime() {
        return timenow;
    }
}
