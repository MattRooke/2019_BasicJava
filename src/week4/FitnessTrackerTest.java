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

    @Test
    void testConstructor() {
        FitnessTracker tracker2 = new FitnessTracker("walking", 15, "August 21 2019");
        assertEquals("walking", tracker2.getActivity());
        assertEquals(15, tracker2.getMinsActive());
        assertEquals("August 21 2019", tracker2.getDate());
    }
}