package Kiosk_JW.entity;

public class Menu {
    private String mainMenuName;
    private String description;

    public Menu(String mainMenuName, String description) {
        this.mainMenuName = mainMenuName;
        this.description = description;
    }

    public String getMainMenuName() {
        return mainMenuName;
    }

    public String getDescription() {
        return description;
    }}
