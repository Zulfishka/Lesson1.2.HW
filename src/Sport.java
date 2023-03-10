public class Sport {

    private Cup cup;
    private Stadium stadium;

    public Cup getCup() {
        return getCup();
    }

    public Stadium getStadium() {
        return stadium;
    }

    public Sport(Cup cup, Stadium stadium) {
        this.cup = cup;
        this.stadium = stadium;
    }

    public String getInfo() {
        return "Cup " + cup.getName() +
                "\nStadium: " + stadium;
    }
}