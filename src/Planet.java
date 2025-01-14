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
