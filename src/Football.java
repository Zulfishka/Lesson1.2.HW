public class Football extends Sport {

    private String type;

    public String getType() {
        return type;
    }

    public Football(Cup cup, Stadium stadium, String type) {
        super(cup, stadium);
        this.type = type;
    }

    public final void Training () {
        System.out.println("Разминка");

    }

    public void signHymn () {
        System.out.println("Выход на поле");
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nType " + type ;
    }
}
