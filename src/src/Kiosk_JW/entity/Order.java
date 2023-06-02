package Kiosk_JW;

public class Order {

    private String orderProduct;
    private int orderPrice;
    private String orderDesc;

    public Order(String orderProduct, int orderPrice, String orderDesc) {
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

    @Override
    public String toString() {
        return getOrderProduct() + " | " + getOrderPrice() + " SOL" + " | " + getOrderDesc();
    }
}