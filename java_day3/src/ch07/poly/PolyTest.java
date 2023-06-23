package ch07.poly;

import ch07.a_extend.spider.Person;
import ch07.a_extend.spider.SpiderMan;

public class PolyTest {

	public static void main(String[] args) {
		SpiderMan sman = new SpiderMan("피터파커");
		Person p = sman; // 조상 타임으로 자식 참조 가능!!
        Object obj = sman; // 자바의 객체는 모두 object!!
        
        
        //오브젝트 배열을 만들면 다 넣을 수 있다.????
        Object [] objs = new Object[3];
        objs[0] = obj; // 도 가능 
        objs[1] = "Hello";
        //objs[2] = Integer.valueOf(2); //// 옛날에는 이렇게 했다고 하셨
        objs[2] = 2; //기본형인데 되네??
        
        //Integer : wrapper class
        
        for(Object o: objs) {
        	System.out.println(o+":" + o.getClass().getName());
        	
        }
        // 폴리뮬피즘이 있어서 프린트에서 다양한걸 출력 가능함 object 가 있어서!!
        
       // System.out.print
        
	}

}
