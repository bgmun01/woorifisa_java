package ch04_control.condition;

import java.util.Scanner;

public class SwitchNoBreak {

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in); // System.in 키보드와 연결하기 위해서?
        String levelString = "";
        System.out.println("당신의 레벨은?");
        //String level = "관리자";
        String level = scanner.next();
        switch (level) {
        case "관리자":
            levelString += "운영자관리";
        case "운영자":
            levelString += "회원관리";
        case "회원":
            levelString += "글쓰기";
        default:
            levelString += "보기";
        }
        System.out.println("당신의 권한은 : " + levelString);
    }
}
