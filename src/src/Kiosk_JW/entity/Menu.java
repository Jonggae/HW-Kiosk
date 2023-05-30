package Kiosk_JW.entity;

import Kiosk_JW.ui.Home;

// 별자리 (메뉴 1번)
public class Menu {
    Home home = new Home();

    public Menu() {
    }

    public void detail() {
        System.out.println("1. Constellation | 생일 별자리");
        System.out.println("2. Stars         | 지구에서 보이는 별");
        System.out.println("3. Planets       | 태양계 8개 행성");
        System.out.println("4. Galaxy        | 먼 우주의 은하");
    }

    public void select(int num) {

        //4가지 하위메뉴로 이동
        switch (num) {
            case 1:
                Constellation.list();
                break;
            case 2:
                Stars.list();
                break;
            case 3:
                Planets.list();
                break;
            case 4:
                Galaxy.list();
                break;
                default: // 1 2 3 4 가 아닐 시,
                    System.out.println("!!!!!다시 선택하세요!!!!!");
                    System.out.println();
                    home.home();
        }

    }
}
