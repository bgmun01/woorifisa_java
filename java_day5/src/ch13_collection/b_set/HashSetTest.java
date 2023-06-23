package ch13_collection.b_set;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
    // TODO: Object 타입의 데이터를 중복 없이 관리하기 위한 자료구조를 선언해보자. 중복없이 관리가 포인트 리스트는 빠이빠이
	Set<Object> set = new HashSet<>();
    // END

    private void addMethod() {
        // TODO: set에 자료를 추가하기 위한 코드를 작성해보자.
    	set.add("hello"); //중복데이터는 허용하지 않는다.
    	set.add("hello"); //입력의 순서로 데이터가 관리되지 않는다.
    	set.add(2);
    	set.add(5);
    	Phone p1 = (new Phone("010", 100));
    	Phone p2 = (new Phone("010", 100));
    	System.out.println((p1==p2) + " " +p1.equals(p2));
    	set.add(p1);
    	set.add(p2);
    	System.out.println(set);
        // END
    }

    private void retrieveMethod() {
        // TODO: set에서 다양한 방식으로 자료를 검색해보자.
    	System.out.println("포함: "+ set.contains("Hello"));
    	System.out.println("비어있니? "+set.isEmpty());
    	System.out.println("몇개나 있어? "+set.size());
    	for(Object obj: set) {
    		System.out.println(obj);
    	}
    	 

        // END
    }

    private void removeMethod() {
        // TODO: set에서 자료를 삭제해보자.
    	System.out.println("삭제 전 :" +set);
    	set.remove("hello");
    	System.out.println("삭제 후 :" +set);
    	set.clear();
    	System.out.println("삭제 후 :" +set);
        // END
    }

    public static void main(String[] args) {
        HashSetTest hst = new HashSetTest();
        hst.addMethod();
        hst.retrieveMethod();
        hst.removeMethod();
    }
}
