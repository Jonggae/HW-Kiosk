package Kiosk;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chosenNumber = 0;
        int movementNumber = 0;
        int time = 0;
        Type type = new Type();

        System.out.println(Type.type(chosenNumber));
        System.out.println(Movements.movement(movementNumber));
        System.out.println(Time.time());
    }
}
