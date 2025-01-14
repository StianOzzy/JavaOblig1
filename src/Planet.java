public class Planet {

    //Instance variables
    private String name;
    private int radius;
    private int mass;

    // Constructor
    public Planet(String name, int radius, int mass) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
    }

    // Get values
    public String getName() {
        return name;
    }

    public int getRadius() {
        return radius;
    }

    public int getMass() {
        return mass;
    }

    // Set values
    public void setName(String name) {
        this.name = name;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }
    // Planeten Mars har en radius på 3389.5 km og en masse på 6.39E23 kg
    public String toString() {
        return "Planet{name='" + name + '\'' + ", radius=" + radius + " km, mass=" + mass + " kg}";
    }
}
