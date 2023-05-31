package Kiosk_JW.entity;

public class Products {

    private String productsName;
    private String productsDesc;
    private int price;

//    Home home = new Home();

    public Products(String productsName, int price, String productsDesc) {
        this.productsName = productsName;
        this.price = price;
        this.productsDesc = productsDesc;
    }

    public String getProductsName() {
        return productsName;
    }
    public String getProductsDesc() {
        return productsDesc;
    }
    public int getPrice() {
        return price;
    }
}

