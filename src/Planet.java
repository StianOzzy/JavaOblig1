/*Oppgave 2.3

I denne oppgaven skal du lage to klasser. En klasse som programmet
kjøres fra og en klasse som definerer en "custom datatype" du skal
opprette objekter av. Klassene er delt opp i de to følgende deloppgavene:

a) Lag en klasse som representerer en planet, og kall denne Planet.
Det vi ønsker å vite om en gitt planet er navn, radius og masse
(den skal altså ha disse instansvariablene). En planet skal kunne
opprettes ved hjelp av en konstruktør på følgende måte:

Planet planet = new Planet("Mars", 3889.5, 6.39E23);

Husk å gjøre instansvariablene private, og lag get- og set-metoder.
Da får vi en innkapsling av disse (ett av prinsippene i OOP).

*/


public class Planet {

    //Instance variables
    private String name;
    private double radius;
    private double mass;

    // Constructor
    public Planet(String name, double radius, double mass) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
    }

    // Get values
    public String getName() {
        return name;
    }

    public double getRadius() {
        return radius;
    }

    public double getMass() {
        return mass;
    }

    // Set values
    public void setName(String name) {
        this.name = name;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }
    // Planeten Mars har en radius på 3389.5 km og en masse på 6.39E23 kg

    public void printPlanetInfo() {
        System.out.println("Planeten " + name + " har en radius på "
                + radius + " km, og en masse på " + mass + " kg.");
    }

}
