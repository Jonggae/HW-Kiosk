package Kiosk;

import java.util.Scanner;

public class Type {
    public static String type(int typeNumber) {
        Scanner sc = new Scanner(System.in);

        System.out.println("운동 방식을 고르세요");
        System.out.println("1. For time");
        System.out.println("2. AMRAP");
        System.out.println("3. EMOM");

        typeNumber = sc.nextInt();
        String type = "";
        if(typeNumber==1) {
            type ="For time을 선택하셨습니다.";
        }else if (typeNumber==2) {
            type = "AMRAP을 선택하셨습니다.";
        }else if (typeNumber==3) {
            type = "EMOM을 선택하셨습니다.";
        }

        return type;

    }
}
