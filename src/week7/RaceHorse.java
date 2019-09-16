package week7;

public class RaceHorse extends Horse {
    int races;

    public RaceHorse(String name, String colour, int year, int races) {
        super(name, colour, year);
        this.races = races;
    }
}
