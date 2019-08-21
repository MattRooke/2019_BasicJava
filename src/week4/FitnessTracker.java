package week4;

public class FitnessTracker {
    private String activity;
    private int minsActive;
    private String date;

    public FitnessTracker() {
        activity = "running";
        minsActive = 0;
        date = "January 1 2019";
    }

    public String getActivity() {
        return activity;
    }

    public int getMinsActive() {
        return minsActive;
    }

    public String getDate() {
        return date;
    }
}
