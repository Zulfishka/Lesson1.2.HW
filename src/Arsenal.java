public final class Arsenal extends Football {

    private String colour;
        private int ageOfFoundation;
    private int numberOfWins;
    private String coach;

    public String getColour() {
        return colour;
    }


    public int getAgeOfFoundation() {
        return ageOfFoundation;
    }

    public int getNumberOfWins() {
        return numberOfWins;
    }
    public String getCoach() {
        return coach;
    }

    public Arsenal(Cup cup, Stadium stadium, String type, String colour,int ageOfFoundation, int numberOfWins, String coach) {
        super(cup, stadium, type);
        this.colour = colour;
        this.ageOfFoundation = ageOfFoundation;
        this.numberOfWins = numberOfWins;
        this.coach = coach;
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "\n Colour " + colour +
                "\n Age of Foundation " + ageOfFoundation +
                "\n Number of wins " + numberOfWins +
                "\n Coach " + coach;
    }

    public void signHymn () {
        System.out.println("Исполняется гимн");
    }




}
