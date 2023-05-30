package Kiosk_JW.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Planets {

    public static void  list() {
        System.out.println("Planets 메뉴입니다.");
        ArrayList<String> planetsList = new ArrayList<String>();
        planetsList.add("1. Mercury | 1 SOL | 수성");
        planetsList.add("2. Venus   | 1 SOL | 금성");
        planetsList.add("3. Earth   | 1 SOL | 지구");
        planetsList.add("4. Mars    | 1 SOL | 화성");
        planetsList.add("5. Jupiter | 1 SOL | 목성");
        planetsList.add("6. Saturn  | 1 SOL | 토성");
        planetsList.add("7. Uranus  | 1 SOL | 천왕성");
        planetsList.add("8. Neptune | 1 SOL | 해왕성");

//        Map<Integer, ArrayList> planetMap = new HashMap<>();
//        planetMap.put(1,planetsList);

        for (int i = 0; i < planetsList.size(); i++) {
            System.out.println(planetsList.get(i));

            System.out.println("원하는 행성을 고르세요.");

        }
    }
}
