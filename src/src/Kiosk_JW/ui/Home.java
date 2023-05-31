package Kiosk_JW.ui;

import Kiosk_JW.entity.Menu;

import java.util.Scanner;

public class Home {

    public void home() {
        System.out.println("-------------------------------------");
        System.out.println("| ★  Welcome to Universe Market  ★ |");
        System.out.println("| ★     원하는 메뉴를 선택하세요     ★ |");
        System.out.println("-------------------------------------");
        Scanner sc = new Scanner(System.in);

        Menu menu = new Menu();
        menu.detail(); //초기메뉴 4개 불러옴

        System.out.println("->> ");
        int menuSelectNum = sc.nextInt();
        menu.select(menuSelectNum); //메뉴 4가지 중 고르는 것의 하위메뉴 출력

//        planets.choose();


    }

}
