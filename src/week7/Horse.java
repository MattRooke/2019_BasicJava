package week7;

public class Horse {
    String name;
    String colour;
    int year;

    public Horse(String name, String colour, int year) {
        this.name = name;
        this.colour = colour;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
