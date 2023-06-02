package Kiosk_JW;

import Kiosk_JW.entity.Products;
import Kiosk_JW.ui.Home;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Order {

    private String orderProduct;
    private int orderPrice;
    private String orderDesc;

    public Order(String orderProduct, int orderPrice, String orderDesc) {
        this.orderPrice = orderPrice;
        this.orderProduct = orderProduct;
        this.orderDesc = orderDesc;
    }

//    private void addList(Map<String, ArrayList<Products>> productMap) {
//
//        ArrayList<Products> products = productMap.get(Home.selectedCategory);
//        Scanner sc = new Scanner(System.in);
//        System.out.println(">>>담고 싶은 천체의 번호를 입력하세요.");
//        int orderNum = sc.nextInt();
//        System.out.println(orderNum + " 번을 선택하셨습니다.");
//
//        Products ordered = products.get(orderNum - 1);
//        System.out.println(ordered.toString());
//
//        ArrayList<String> orderList = new ArrayList<>();
//        orderList.add(ordered.toString());
//        System.out.println(orderList);
//
//    }

    public String getOrderProduct() {
        return orderProduct;
    }

    public String getOrderDesc() {
        return orderDesc;
    }

    public int getOrderPrice() {
        return orderPrice;
    }

    @Override
    public String toString() {
        return getOrderProduct() + " | " + getOrderPrice() + " SOL" + " | " + getOrderDesc();
    }

//    private ArrayList<Order> orders() {
//        ArrayList<Order> orderList = new ArrayList<>();
//        orderList.add(new Order())
//    }

}