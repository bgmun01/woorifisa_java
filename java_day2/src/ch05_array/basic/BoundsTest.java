package ch05_array.basic;

import java.util.Arrays;

public class BoundsTest {

    public static void main(String[] args) {
        char [] charArray = new char [3];
        // TODO: charArray에 'A', 'B', 'C'를 저장하세요.
        for(int i = 0; i < charArray.length;i++) { //다음에 증감식 i++
        	charArray[i] = (char)('A'+ i); //실행문?
        }
        // END
        
        // TODO: index 0~4까지 charArray의 요소를 출력하시오. 문제 상황을 인지하고 대책을 마련하시오.
        for(int i = 0; i<charArray.length;i++) {
        	System.out.println(charArray[i]);
        }
        // 단지 배열의 요소를 출력해보고 싶다면?
        System.out.println(Arrays.toString(charArray)); //토스트링 배열을 문자열을?
        // END
    }
}
