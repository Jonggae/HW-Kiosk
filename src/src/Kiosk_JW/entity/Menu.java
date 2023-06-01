package Kiosk_JW.entity;

import Kiosk_JW.ui.Home;

import java.util.Scanner;

// 별자리 (메뉴 1번)
public class Menu {
    private String mainMenuName;
    private String description;

    public Menu() {
    }

    Home home = new Home();

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
