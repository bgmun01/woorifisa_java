package ch04_control.condition;

import java.util.Scanner;

public class SwitchDayByMonth {

	public static void main(String[] args) {
		// 달을 입력받는다 --> 거기에 해당하는 날 수를 출력
		// 1월 --> 31일, 2월 -> 28일
		Scanner scanner = new Scanner(System.in);
		System.out.println("몇월이 궁금해?");
		//String month = scanner.next();
		//switch (month) {
		//case "1월":
		//	day = 
		int month = scanner.nextInt();
		int days =0;
		switch(month) {
		case 2:
			days = 28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		default:
			days = 31;
		}
		System.out.printf("%d월은 %d일까지 있지~~\n", month, days);
	}

}
