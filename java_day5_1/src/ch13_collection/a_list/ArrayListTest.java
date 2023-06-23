package ch13_collection.a_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest {
    // TODO: Object를 저장할 수 있는 List를 만들어보자.
	List<Object> list = new ArrayList<>();
    // END

    public void createTest() {
        // TODO: list에 다양한 데이터를 추가하고 출력해보자.
    list.add("Hello"); // append
    list.add("java"); // append
    list.add(0, 1);  // insert
    list.add(1);
    System.out.println(list);
        // END
    }

    public void retrieveTest() {
        // TODO: list의 내용을 다양한 방법으로 조회해보자.
    	System.out.println("자바 있어? " + list.contains("Java"));
    //	System.out.println(list.eq);
    	List<Object> temp = List.of(1, "Hello", "Java", 1);
    	System.out.println("몽창 같니?"+ list.equals(temp)+", 같은 액체니?" + (list == temp)) ;
    	System.out.println("1번째 요소?? " +list.get(1));
    	System.out.println("Java는 몇 번째?" + list.indexOf("Java"));
    	System.out.println("Python는 몇 번째?" + list.indexOf("Java"));
    	System.out.println("전체 자료는 몇개?" + list.size());
    	System.out.println("배열로 바꿔봐?>?" + Arrays.toString(list.toArray()));
    	
    	for(Object o: list) {
    		System.out.println(o);
    	}
        // END   ///...은 0개 이상
    }

    public void updateTest() {
        // TODO: list의 요소를 수정하고 출력해보자.

        // END
    }

    public void deleteTest() {
        // TODO: list의 내용을 삭제해보자.

        // END
    }

    public static void main(String[] args) {
        ArrayListTest alt = new ArrayListTest();
        alt.createTest();
        alt.retrieveTest();
        alt.updateTest();
        alt.deleteTest();
    }
}
