package Kiosk_JW;

import Kiosk_JW.entity.Menu;

import Kiosk_JW.entity.Products;

import Kiosk_JW.ui.Home;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Kiosk {

    public void startKiosk() {
        Home.homeMenu(); // 화면 첫 부분 출력
        Home.printProductDetail(productDetail(mainMenu()));
        Home.orderMenu();
    }

    //메인메뉴 호출
    public ArrayList<Menu> mainMenu() {
        ArrayList<Menu> menuList = new ArrayList<>();
        menuList.add(new Menu("1. Constellation", "생일 별자리"));
        menuList.add(new Menu("2. Stars", "지구에서 보이는 별들"));
        menuList.add(new Menu("3. Planets", "태양계 8개 행성"));
        menuList.add(new Menu("4. Galaxy", "먼 우주의 은하"));

        for (Menu menu : menuList) {
            System.out.println(menu.getMainMenuName() + "   | " + menu.getDescription());
        }
        return menuList;
    }

    //하위 메뉴(상품들)
    public Map<String, ArrayList<Products>> productDetail(ArrayList<Menu> menuList) {
        Map<String, ArrayList<Products>> productMap = new HashMap<>();
        // 첫번째 카테고리 product
        ArrayList<Products> products = new ArrayList<>();
        products.add(new Products(1," Aries", 50, "양자리"));
        products.add(new Products(2," Taurus", 50, "황소자리"));
        products.add(new Products(3," Gemini", 50, "쌍둥이자리"));
        products.add(new Products(4," Cancer", 50, "게자리"));
        products.add(new Products(5," Leo", 50, "사자자리"));
        products.add(new Products(6," Virgo", 50, "처녀자리"));
        products.add(new Products(7," Libra", 50, "천칭자리"));
        products.add(new Products(8," Scorpio", 50, "전갈자리"));
        products.add(new Products(9," Sagittarius", 50, "궁수자리"));
        products.add(new Products(10," Capricorn", 50, "염소자리"));
        products.add(new Products(11," Aquarius", 50, "물병자리"));
        products.add(new Products(12," Pisces", 50, "물고기자리"));
        productMap.put(menuList.get(0).getMainMenuName(), products); // 1. Constellation에 들어감

        // 두번째 카테고리 product (Stars)
        products = new ArrayList<>();
        products.add(new Products(1," Sirius", 2, "밤하늘 지구에서 보이는 가장 밝은 별, 큰개자리"));
        products.add(new Products(2," Betelgeuse", 100, "오리온자리의 가장 큰별"));
        products.add(new Products(3," Canopus", 50, "밤하늘 지구에서 보이는 두번째로 밝은 별, 노인성"));
        products.add(new Products(4," Sun", 1, "태양"));
        products.add(new Products(5," Vega", 10, "여름철 가장 밝은 별, 거문고자리"));
        productMap.put(menuList.get(1).getMainMenuName(), products); //2. Stars에 들어감.

        // 세번째 카테고리 product (planets)
        products = new ArrayList<>();
        products.add(new Products(1," Mercury", 1, "수성"));
        products.add(new Products(2," Venus", 1, "금성"));
        products.add(new Products(3," Earth", 1, "지구"));
        products.add(new Products(4," Mars", 1, "화성"));
        products.add(new Products(5," Jupiter", 1, "목성"));
        products.add(new Products(6," Saturn", 1, "토성"));
        products.add(new Products(7," Uranus", 1, "천왕성"));
        products.add(new Products(8," Neptune", 1, "해왕성"));
        productMap.put(menuList.get(2).getMainMenuName(), products); //3. Planets에 들어감

        // 네번째 카테고리 product
        products = new ArrayList<>();
        products.add(new Products(1," MilkyWay", 1000, "우리 은하"));
        products.add(new Products(2," Andromeda", 1000, "안드로메다 은하"));
        products.add(new Products(3," Large Magellanic Cloud", 1000, "대마젤란 은하"));
        products.add(new Products(4," Small Magellanic Cloud", 1000, "소마젤란 은하"));
        productMap.put(menuList.get(3).getMainMenuName(), products); //4. galaxy에 들어감.
        return productMap;
    }
    /* productMap -> { key : {1. Constellation}, value : {1, 2, 3, ... ,12},
                       key : {2. Stars},         value : {1, 2, 3, ... ,5},
                       key : {3. Planets},       value : {1, 2, 3, ... ,8},
                       key : {4. Galaxy},        value : {1, 2, 3,      4} }
      ArrayList<Products> -> { {별자리 12개}, {별들 5개}, {행성들 8개}, {은하들 4개} }
                         이게 맞나?*/

    public static void main(String[] args) {

        Kiosk kiosk = new Kiosk();
        kiosk.startKiosk();

    }
}

