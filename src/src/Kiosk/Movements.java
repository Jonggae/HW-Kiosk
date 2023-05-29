package Kiosk;
//운동메뉴
import java.util.Scanner;

public class Movements {
    public static String movement(int selectedNumber) {
        Scanner sc = new Scanner(System.in);
        System.out.println("운동 동작을 고르세요");
        System.out.println("1. Push Up");
        System.out.println("2. Sit up");
        System.out.println("3. Air squat");
        System.out.println("4. Burpee");
        System.out.println("5. Plank");

        int selectedNumber = sc.nextByte();
        String answer;

        if (selectedNumber == 1) {
           answer =  "Push Up을 선택하셨습니다.";
        } else if (selectedNumber == 2) {
           answer = "Sit up을 선택하셨습니다.";
        }else if (selectedNumber == 3) {
            answer= "Air squat을 선택하셨습니다.";
        }else if (selectedNumber == 4) {
            answer= "Burbee을 선택하셨습니다.";
        }else if (selectedNumber == 5) {
            answer= "Plank을 선택하셨습니다.";
        }

        return answer;
    }
}
