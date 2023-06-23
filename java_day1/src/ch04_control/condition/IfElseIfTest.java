package ch04_control.condition;

import java.util.Scanner;

public class IfElseIfTest {
    public static void main(String[] args) {
        System.out.println("32 ~ 126 사이의 정수를 입력하세요.");
        Scanner scanner = new Scanner(System.in); // 사용자로부터 입력을 받겠다
        int scanned = scanner.nextInt();
        String type = null;
        if (scanned >= 48 && scanned < 58) {
            type = "숫자";
        } else if (scanned >= 66 && scanned < 91) {
            type = "대문자";
        } else if (scanned >= 97 && scanned < 123) {
            type = "소문자";
        } else {
            type = "기타 타입";
        }
        System.out.printf("숫자 %d는 문자로 %c이고 %s입니다.\n", scanned, scanned, type);
       // scanner.close(); 클로즈 하면 값을 입력받지 못함
        // 나이를 입력하세요!!
        // 8살미만 - 미취학
        // 18세 미만 - 청소년
        // 50세 미만 - 청년
        // 50세 이상 - 장년
        System.out.println("나이를 입력하세요");
        int age = scanner.nextInt();
        String ageType = null;
        if(age < 8) {
        	//System.out.println("미취학");
        	ageType = "미취학";
        }else if(age < 18) {
        	//System.out.println("청소년");
        	ageType = "청소년";
        }else if(age < 50) {
        	ageType = "청년";
        }else {
        	ageType = "장년";
        }
        System.out.printf("%d살은 %s이다.\n", age, ageType);
    }

}
