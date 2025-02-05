package week8.debugging;

public abstract class DebugBoat {
    String boatType;
    int passengers;
    String power;

    public DebugBoat(String boatType) {
        this.boatType = boatType;
    }

    // override equals() method to satisfy
    // requirements of Debug Exercise 3.
    public boolean equals(DebugBoat otherBoat) {
        boolean result;
        result = (passengers == otherBoat.passengers) && (power.equals(otherBoat.power));
        return result;
    }

    public String toString() {
        return ("This " + boatType + "boat carries " + passengers +
                " and is powered by " + power);
    }

    public abstract void setPower();

    public abstract void setPassengers();
}