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

//    public void select() {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();}}
//        //4가지 하위메뉴로 이동
//     switch (num) {
//           case 1 -> constellationDetail();
//          case 2 -> starDetail();
//     case 3 -> planetDetail();
//           case 4 -> galaxyDetail();
//         default -> { // 1 2 3 4 가 아닐 시,
//               System.out.println("!!!!!다시 선택하세요!!!!!");
//           System.out.println();
//            home.homeMenu();
//           }
//       }
//    }
//}
//
//
//      System.out.println("1. Constellation | 생일 별자리");
//     System.out.println("2. Stars         | 지구에서 보이는 별");
//        System.out.println("3. Planets       | 태양계 8개 행성");
//        System.out.println("4. Galaxy        | 먼 우주의 은하");
//    // 별자리 세부메뉴
//    public void constellationDetail() {
//        System.out.println("Constellation 메뉴입니다.");
//        ArrayList<String> constellationList = new ArrayList<String>();
////        constellationList.add("1. Aries       | 50 SOL | 양자리");
////        constellationList.add("2. Taurus      | 50 SOL | 황소자리");
////        constellationList.add("3. Gemini      | 50 SOL | 쌍둥이자리");
////        constellationList.add("4. Cancer      | 50 SOL | 게자리");
////        constellationList.add("5. Leo         | 50 SOL | 사자자리");
////        constellationList.add("6. Virgo       | 50 SOL | 처녀자리");
////        constellationList.add("7. Libra       | 50 SOL | 천칭자리");
////        constellationList.add("8. Scorpio     | 50 SOL | 전갈자리");
////        constellationList.add("9. Sagittarius | 50 SOL | 궁수자리");
////        constellationList.add("10. Capricorn  | 50 SOL | 염소자리");
////        constellationList.add("11. Aquarius   | 50 SOL | 물병자리");
////        constellationList.add("12. Pisces     | 50 SOL | 물고기자리");
////
////        for (int i = 0; i < constellationList.size(); i++) {
////            System.out.println(constellationList.get(i));
////        }
////    }
////    //별 세부메뉴
////    public void starDetail() {
////        System.out.println("Stars 메뉴입니다.");
////        ArrayList<String> starsList = new ArrayList<String>();
////        starsList.add("1. Sirius    | 2 SOL   | 밤하늘 지구에서 보이는 가장 밝은 별, 큰개자리");
////        starsList.add("2. Betelgeus | 100 SOL | 오리온자리의 가장 큰 별");
////        starsList.add("3. Canopus   | 50 SOL  | 밤하늘 지구에서 보이는 두번째로 밝은 별, 노인성");
////        starsList.add("4. Sun       | 1 SOL   | 태양");
////        starsList.add("5. Vega      | 10 SOL  | 여름철 가장 밝은 별, 거문고자리");
////
////        for (int i = 0; i < starsList.size(); i++) {
////            System.out.println(starsList.get(i));
////        }
////    }
////    // 행성 세부메뉴
////    public void planetDetail() {
////        System.out.println("Planets 메뉴입니다.");
////        ArrayList<String> planetsList = new ArrayList<String>();
////        planetsList.add("1. Mercury | 1 SOL | 수성");
////        planetsList.add("2. Venus   | 1 SOL | 금성");
////        planetsList.add("3. Earth   | 1 SOL | 지구");
////        planetsList.add("4. Mars    | 1 SOL | 화성");
////        planetsList.add("5. Jupiter | 1 SOL | 목성");
////        planetsList.add("6. Saturn  | 1 SOL | 토성");
////        planetsList.add("7. Uranus  | 1 SOL | 천왕성");
////        planetsList.add("8. Neptune | 1 SOL | 해왕성");
////
////        for (int i = 0; i < planetsList.size(); i++) {
////            System.out.println(planetsList.get(i));
////        }
////    }
////    //은하 세부메뉴
////    public void galaxyDetail() {
////        System.out.println("Galaxy 메뉴입니다.");
////        ArrayList<String> GalaxyList = new ArrayList<String>();
////        GalaxyList.add("1. MilkyWay               | 1000 SOL | 우리 은하");
////        GalaxyList.add("2. Andromeda              | 1000 SOL | 안드로메다 은하");
////        GalaxyList.add("3. Large Magellanic Cloud | 1000 SOL | 대마젤란 은하");
////        GalaxyList.add("4. Small Magellanic Cloud | 1000 SOL | 소마젤란 은해");
////
////        for (int i = 0; i < GalaxyList.size(); i++) {
////            System.out.println(GalaxyList.get(i));
////        }
////    }
////
//
////
////
////    }

