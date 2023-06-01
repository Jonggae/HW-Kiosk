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


    // !!! 중요한 부분 toString은 요소를 String으로 바꿀때 쓴다. 최상위 Object의 메서드이므로 오버라이딩하여 원하는 형태로 바꾸어 사용했다.
    @Override
    public String toString() {
        return getProductsName()+" | " + getPrice()+" SOL"+" | " +getProductsDesc();
    }
}

