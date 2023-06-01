package Kiosk_JW.ui;

import Kiosk_JW.Kiosk;
import Kiosk_JW.entity.Products;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Home {
    static Scanner sc = new Scanner(System.in);
    static Map<String, ArrayList<Products>> productMap = new HashMap<>();
    ArrayList<Products> products;

    static Kiosk kiosk = new Kiosk();

    public void homeMenu() {
        System.out.println("-------------------------------------");
        System.out.println("| ★  Welcome to Universe Market  ★ |");
        System.out.println("-------------------------------------");
        System.out.println("| ★     원하는 메뉴를 선택하세요     ★ |");
        System.out.println("-------------------------------------");
    }

    public static void orderMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------------------------");
        System.out.println("5. 주문 ");
        System.out.println("6. 주문 취소");

//        int inputNum = sc.nextInt();
//        if (inputNum == 5){
//            orderList
        }


    public static void printProductDetail(Map<String, ArrayList<Products>> productMap) {


        System.out.print(">>>");
        int inputNum = sc.nextInt();

        String selectedCategory = getCategoryByNumber(inputNum);
        if (selectedCategory != null) {
            System.out.println();
            System.out.println("----- " + selectedCategory + " -----");

            ArrayList<Products> products = productMap.get(selectedCategory);
            if (products != null) {
                for (Products product : products) {
                    System.out.print(product.getProductsName());
                    System.out.print(" | " + product.getPrice() + " SOL");
                    System.out.print(" | " + product.getProductsDesc());
                    System.out.println();
                }
                 //담을 것들 선택하기
                System.out.println(">>>담고 싶은 천체의 번호를 입력하세요.");
                int orderNum = sc.nextInt();
                System.out.println(orderNum + " 번을 선택하셨습니다.");
                Products ordered = products.get(orderNum - 1);
                System.out.println(ordered.toString());

                ArrayList<String> orderList = new ArrayList<>();
                orderList.add(ordered.toString());
                System.out.println(orderList);
            } else { kiosk.startKiosk();}
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



