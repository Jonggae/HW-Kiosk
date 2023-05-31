package Kiosk_JW.entity;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Order {

    private String orderProduct;
    private int orderPrice;
    private String orderDesc;

    public void order (String orderProduct, int orderPrice, String orderDesc) {
        this.orderPrice = orderPrice;
        this.orderProduct = orderProduct;
        this.orderDesc = orderDesc;
    }

    public String getOrderProduct() {
        return orderProduct;
    }

    public String getOrderDesc() {
        return orderDesc;
    }

    public int getOrderPrice() {
        return orderPrice;
    }

}