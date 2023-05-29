package Kiosk;
//시간메뉴
import java.util.Scanner;
public class Time {


    public static String time() {
        Scanner sc = new Scanner(System.in);
        System.out.println("운동 시간(분)을 입력하세요");
        String answer = "";
        int timeNumber = sc.nextInt();
        answer = "오늘의 총 운동시간은 "+timeNumber+" 분 입니다.";
        return answer;
    }
}
