package Kiosk_JW.entity;

import java.util.ArrayList;

public class Galaxy {
    public static void list() {
        System.out.println("Galaxy 메뉴입니다.");
        ArrayList<String> GalaxyList = new ArrayList<String>();
        GalaxyList.add("1. MilkyWay               | 1000 SOL | 우리 은하");
        GalaxyList.add("2. Andromeda              | 1000 SOL | 안드로메다 은하");
        GalaxyList.add("3. Large Magellanic Cloud | 1000 SOL | 대마젤란 은하");
        GalaxyList.add("4. Small Magellanic Cloud | 1000 SOL | 소마젤란 은해");

        for (int i = 0; i < GalaxyList.size(); i++) {
            System.out.println(GalaxyList.get(i));
        }
    }
}
