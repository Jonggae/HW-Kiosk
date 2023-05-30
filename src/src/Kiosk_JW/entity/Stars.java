package Kiosk_JW.entity;

import java.util.ArrayList;

public class Stars {
    // Sirius, Betelgeus, Canopus, Sun, Vega
    public static void list() {
        System.out.println("Stars 메뉴입니다.");
        ArrayList<String> starsList = new ArrayList<String>();
        starsList.add("1. Sirius    | 2 SOL   | 밤하늘 지구에서 보이는 가장 밝은 별, 큰개자리");
        starsList.add("2. Betelgeus | 100 SOL | 오리온자리의 가장 큰 별");
        starsList.add("3. Canopus   | 50 SOL  | 밤하늘 지구에서 보이는 두번째로 밝은 별, 노인성");
        starsList.add("4. Sun       | 1 SOL   | 태양");
        starsList.add("5. Vega      | 10 SOL  | 여름철 가장 밝은 별, 거문고자리");

        for (int i = 0; i < starsList.size(); i++) {
            System.out.println(starsList.get(i));
        }
    }
}


//        System.out.println("1. Sirius    | 2 SOL | 밤하늘 지구에서 보이는 가장 밝은 별, 큰개자리");
//        System.out.println("2. Betelgeus | 100 SOL | 오리온자리의 가장 큰 별");
//        System.out.println("3. Canopus   | 50 SOL | 밤하늘 지구에서 보이는 두번째로 밝은 별, 노인성");
//        System.out.println("4. Sun       | 1 SOL | 태양");
//        System.out.println("5. Vega      | 10 SOL | 여름철 가장 밝은 별, 거문고자리");


