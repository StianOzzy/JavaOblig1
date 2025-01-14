public class Oppgave2_3 {

    public static void main(String[] args) {

        // Name, radius (in km), mass (in kg)
        Planet planet1 = new Planet("Merkur",2439.7,3.285E23);
        Planet planet2 = new Planet("Venus", 6051.8, 4.867E24);
        Planet planet3 = new Planet("Jorden", 6378, 5.97E24);
        Planet planet4 = new Planet("Mars", 3889.5, 6.39E23);

        planet1.printPlanetInfo();
        planet2.printPlanetInfo();
        planet3.printPlanetInfo();
        planet4.printPlanetInfo();

    }
}
