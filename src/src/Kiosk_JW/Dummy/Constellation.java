package Kiosk_JW.Dummy;

import java.util.ArrayList;

public class Constellation {

    public static void list() {
        System.out.println("Constellation 메뉴입니다.");
        ArrayList<String> constellationList = new ArrayList<String>();
        constellationList.add("1. Aries       | 50 SOL | 양자리");
        constellationList.add("2. Taurus      | 50 SOL | 황소자리");
        constellationList.add("3. Gemini      | 50 SOL | 쌍둥이자리");
        constellationList.add("4. Cancer      | 50 SOL | 게자리");
        constellationList.add("5. Leo         | 50 SOL | 사자자리");
        constellationList.add("6. Virgo       | 50 SOL | 처녀자리");
        constellationList.add("7. Libra       | 50 SOL | 천칭자리");
        constellationList.add("8. Scorpio     | 50 SOL | 전갈자리");
        constellationList.add("9. Sagittarius | 50 SOL | 궁수자리");
        constellationList.add("10. Capricorn  | 50 SOL | 염소자리");
        constellationList.add("11. Aquarius   | 50 SOL | 물병자리");
        constellationList.add("12. Pisces     | 50 SOL | 물고기자리");

        for (int i = 0; i < constellationList.size(); i++) {
            System.out.println(constellationList.get(i));
        }
    }
}

