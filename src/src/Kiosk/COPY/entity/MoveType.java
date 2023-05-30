package Kiosk.COPY.entity;

public class MoveType {
    private String name;
    private String description;

    MoveType() {}

    public MoveType (String name, String description) {
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
