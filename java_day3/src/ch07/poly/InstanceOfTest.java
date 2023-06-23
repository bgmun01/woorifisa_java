package ch07.poly;

import ch07.a_extend.spider.Person;
import ch07.a_extend.spider.Spider;
import ch07.a_extend.spider.SpiderMan;

public class InstanceOfTest {
    public void badCasting() {
      Person p = new Person("피터파커");
      SpiderMan sman = (SpiderMan)p;
      sman.fireWeb();
    }

    public void goodCasting() {
        Person p = new Person("피터파커");
        //메모리에 있는 진짜 타입 확인 !!
        if(p instanceof SpiderMan) {   //이걸 넣어야 한다..?
        	SpiderMan sman = (SpiderMan)p;
        	sman.fireWeb();
        }else {
        	System.out.println("스파이더맨 아닌데");
        }
  
    }

    public static void main(String[] args) {
        InstanceOfTest iot = new InstanceOfTest();
        // 아래 메서드 호출은 runtime 오류를 발생시킨다.
      //  iot.badCasting();
        iot.goodCasting();
    }
}
