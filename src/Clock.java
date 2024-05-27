public class Clock {
    private int hours;
    private int minutes;
    private int seconds;
    private boolean isAM;

    public Clock(int hours, int minutes, int seconds) {
        if (isValidTime(hours, minutes, seconds)) {
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
            this.isAM = (hours < 12);
        } else {
            System.out.println("Invalid time provided. Defaulting to 00:00:00 AM.");
            this.hours = 0;
            this.minutes = 0;
            this.seconds = 0;
            this.isAM = true;
        }
    }

    private boolean isValidTime(int hours, int minutes, int seconds) {
        return (hours >= 0 && hours <= 23) &&
                (minutes >= 0 && minutes <= 59) &&
                (seconds >= 0 && seconds <= 59);
    }

    public void setAM(boolean isAM) {
        this.isAM = isAM;
    }
    @Override
    public String toString() {
        String time = String.format("%0 2d:%02d:%02d", hours, minutes, seconds);
        String ampm = (isAM) ? "AM" : "PM";
        return time + " " + ampm;
    }

    public static void main(String[] args) {
        Clock clock = new Clock(11, 45, 30); // Example usage
        System.out.println("Current Time: " + clock);
        clock.setAM(false);
        System.out.println("Time in PM mode: " + clock);
    }
}
