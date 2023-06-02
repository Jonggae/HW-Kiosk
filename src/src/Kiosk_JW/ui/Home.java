package Kiosk_JW.ui;

import Kiosk_JW.Kiosk;
import Kiosk_JW.entity.Products;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Home {
    static Scanner sc = new Scanner(System.in);

    static ArrayList<String> orderList = new ArrayList<>();

    static Kiosk kiosk = new Kiosk();
    static Map<String, ArrayList<Products>> productMap = new HashMap<>();


    public static void homeMenu() {
        System.out.println("-------------------------------------");
        System.out.println("| ★  Welcome to Universe Market  ★ |");
        System.out.println("-------------------------------------");
        System.out.println("| ★     원하는 메뉴를 선택하세요     ★ |");
        System.out.println("-------------------------------------");
    }

    public static void orderMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n-------------------------------------");
        System.out.println("5. 가져가기        6.취소");
        System.out.println("-------------------------------------");
        int orderNum = sc.nextInt();
        if (orderNum == 5) {
            System.out.println("천체를 담았습니다.");
            System.out.println(orderList.toString());
            printProductDetail(productMap);
        }
        if (orderNum == 6) {
            System.out.println("아무것도 담지 않았습니다");
            orderList.clear();
            kiosk.startKiosk();
        }
    }


    public static void printProductDetail(Map<String, ArrayList<Products>> productMap) {
        System.out.print(">>>");
        int inputNum = 0;
        inputNum = sc.nextInt();
        String selectedCategory = getCategoryByNumber(inputNum);
        if (selectedCategory != null) {
            System.out.println();
            System.out.println("----- " + selectedCategory + " -----");

            ArrayList<Products> products = productMap.get(selectedCategory);
            if (products != null) {
                for (Products product : products) {
                    System.out.print(product.getPNum() + ".");
                    System.out.print(product.getProductsName());
                    System.out.print(" | " + product.getPrice() + " SOL");
                    System.out.print(" | " + product.getProductsDesc());
                    System.out.println();
                }

                //담을 것들 선택하기
                System.out.println(">>>담고 싶은 천체의 번호를 입력하세요.");
                int orderNum = sc.nextInt();
                System.out.println("-------------------------------------");
                System.out.println(orderNum + " 번을 선택하셨습니다.");
                if (orderNum > products.size()) {
                    System.out.println("없는 메뉴입니다. 다시 선택하세요.");
                    printProductDetail(kiosk.productDetail(kiosk.mainMenu()));
                } else {
                System.out.println("현재 선택->" + products.get(orderNum - 1));
                System.out.println("-------------------------------------");

                Products ordered = products.get(orderNum - 1);
                orderList.add(ordered.toString());}

            } else {
                kiosk.startKiosk();
            }
        }
    }


    private static String getCategoryByNumber(int number) {
        return switch (number) {
            case 1 -> "1. Constellation";
            case 2 -> "2. Stars";
            case 3 -> "3. Planets";
            case 4 -> "4. Galaxy";

            default -> "잘못 고르셨습니다. 다시 선택하세요";
        };
    }
}



