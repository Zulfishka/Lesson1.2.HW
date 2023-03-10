public class Main {
    public static void main(String[] args) {

        Cup PremierLeague = new Cup("Premier League");
        Football objectA = new Football(PremierLeague, Stadium.WEMBLEY, "Soccer");
        System.out.println(objectA.getInfo());
        objectA.Training();
        Arsenal objectB = new Arsenal(PremierLeague, Stadium.EMIRATES, "Soccer", "Red", 1886, 13, "Arteta");
        Arsenal objectC = new Arsenal(PremierLeague, Stadium.MINIEMIRATES, "MiniFootball", "Red", 1961, 11, "Dick");
        System.out.println(objectB.getInfo());
        System.out.println(objectC.getInfo());
        objectB.signHymn();
        objectC.signHymn();


    }



}