package Kiosk_JW.entity;

public class Menu {
    private String mainMenuName;
    private String description;

    //생성자 ( 클래스와 이름이 같음)
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
