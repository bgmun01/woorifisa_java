package ch04_control.condition;

public class IfTest {

    public static void main(String[] args) {
        int visitCnt = 0;
        if (visitCnt < 1) {
            System.out.println("처음 방문이시군요!");
        }
        System.out.println("오늘 날씨가 참 좋습니다.");

        // 9시 넘으면 지각이이에요!  10분까지 왔으니 기록은 안남죠.
        // 9시 이전은 좋은 아침
        
        int hour = 9;
        int min = 15;
        
        if(hour <9) {
        	System.out.println("좋은 아침!!!");
        }else {
        	System.out.println("9시 넘으면 지각이에요!!");
        	if(min <=10) {
        		System.out.println("기록은 안남죠");
        	}
        }
        
        
        
        
    }

}
