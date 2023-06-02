package Kiosk_JW.ui;

import Kiosk_JW.Kiosk;
import Kiosk_JW.Order;
import Kiosk_JW.entity.Products;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Home {

    static Scanner sc = new Scanner(System.in);

    static ArrayList<Order> orderList = new ArrayList<>();

    static Kiosk kiosk = new Kiosk();


    public static void homeMenu() {
        System.out.println("-------------------------------------");
        System.out.println("| ★  Welcome to Universe Market  ★ |");
        System.out.println("-------------------------------------");
        System.out.println("| ★     원하는 메뉴를 선택하세요     ★ |");
        System.out.println("-------------------------------------");

    }
    public static void printProductDetail(Map<String, ArrayList<Products>> productMap) {
        System.out.print(">>>");
        int inputNum = 0;
        inputNum = sc.nextInt();
        String selectedCategory = getCategoryByNumber(inputNum);
        if (selectedCategory != null) {
            System.out.println();
            System.out.println("-------------------------------------");
            System.out.println("     " + selectedCategory + "     ");

            ArrayList<Products> products = productMap.get(selectedCategory);
            if (products != null) {
                for (Products product : products) {
                    System.out.print(product.getPNum() + ".");
                    System.out.print(product.getProductsName());
                    System.out.print(" | " + product.getPrice() + " SOL");
                    System.out.print(" | " + product.getProductsDesc());
                    System.out.println();
                }
//--------------------------------------------------------------------------
                //담을 것들 선택하기
                System.out.println("-------------------------------------");
                System.out.println(">>>담고 싶은 천체의 번호를 입력하세요.");
                int orderNum = sc.nextInt();
                System.out.println("-------------------------------------");
                System.out.println(orderNum + " 번을 선택하셨습니다.");
                if (orderNum > products.size()) {
                    System.out.println("-------------------------------------");
                    System.out.println("\n※※※ 없는 메뉴입니다. 다시 선택하세요. ※※※\n");
                    System.out.println("-------------------------------------\n");

                    printProductDetail(kiosk.productDetail(kiosk.mainMenu()));
                } else {
                    System.out.println("현재 선택->" + products.get(orderNum - 1));
                    System.out.println("-------------------------------------");

                    Products ordered = products.get(orderNum - 1);
                    orderList.add(new Order(ordered.getProductsName(), ordered.getPrice(), ordered.getProductsDesc()));
                }
                orderCheck();
                if (orderNum == 0) {
                    orderCheck();
                }

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

            default -> "\n※※※ 잘못 고르셨습니다. 다시 선택하세요. ※※※\n";
        };
    }
    public static void orderMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n-------------------------------------");
        System.out.println("5. 주문하기        6. 장바구니 비우기");
        System.out.println("0. 메인 메뉴로");
        System.out.println("-------------------------------------");

        int orderNum = sc.nextInt();
        switch (orderNum) {
            case 5 -> {
                System.out.println("주문이 완료되었습니다.");
                System.out.println("주문 내역");
                orderDone();
            }
            case 6 -> {
                System.out.println("장바구니를 비웠습니다. 메인으로 돌아갑니다.");
                orderList.clear();
                kiosk.startKiosk();
            }
            case 0 -> kiosk.startKiosk();

            default ->{System.out.println("잘못 입력하였습니다.");
                orderMenu();}
        }
    }

    private static void orderCheck() {
        System.out.println("5. 장바구니 확인(확인 후 주문하세요!)");
        System.out.println("6. 장바구니 비우기");
        System.out.println("0. 더 주문하기 (메인으로)");
        System.out.print(">>>");
        int orderCheck = sc.nextInt();
        switch (orderCheck) {
            case 5 -> {
                System.out.println("---------현재 담긴 천체들입니다---------");
                orderDone();
            }
            case 6 -> {
                System.out.println("장바구니를 비웠습니다. 메인으로 돌아갑니다.");
                orderList.clear();
                kiosk.startKiosk();
            }
            case 0 -> kiosk.startKiosk();
            default -> {
                System.out.println("\n※※※ 잘못 입력하였습니다. 다시 입력하세요. ※※※\n");
                orderCheck();
            }
        }
    }

    private static void orderDone() {
        int i = 0;
        for (i = 0; i < orderList.size(); i++) {
            System.out.println((orderList.get(i)).toString());
        }
    }
}





