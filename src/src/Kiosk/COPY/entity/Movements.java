package Kiosk.COPY.entity;

public class Movements {
    private String name;
    private String description;
    Movements () {}

    public Movements (String name, String description) {
        this.name = name;
        this.description = description;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
}
