package week4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FitnessTrackerTest {
    FitnessTracker tracker = new FitnessTracker();

    @Test
    void getActivity() {
        assertEquals("running", tracker.getActivity());
    }

    @Test
    void getMinsActive() {
        assertEquals(0, tracker.getMinsActive());
    }

    @Test
    void getDate() {
        assertEquals("January 1 2019", tracker.getDate());
    }
}