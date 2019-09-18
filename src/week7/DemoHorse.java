package week7;

public class DemoHorse {
    public static void main(String[] args) {
        Horse normalHorse = new Horse("Lil Nas", "Black", 1991);
        RaceHorse raceHorse = new RaceHorse("Old Town Road", "Bay", 2019, 4);
        System.out.printf("Normal Horse\n Name: %s\n Colour: %s\n Birth Year: %s\n", normalHorse.getName(), normalHorse.getColour(), normalHorse.getYear());
        System.out.printf("Race Horse\n Name: %s\n Colour: %s\n Birth Year: %s\n Races: %s\n", raceHorse.getName(), raceHorse.getColour(), raceHorse.getYear(), raceHorse.getRaces());
    }
}
