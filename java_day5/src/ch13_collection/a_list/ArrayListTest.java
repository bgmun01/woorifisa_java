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
    	list.add("Java");  // append
    	list.add(0, 1);    // insert
    	list.add(1);
    	System.out.println(list);
        // END
    }

    public void retrieveTest() {
        // TODO: list의 내용을 다양한 방법으로 조회해보자.
    	System.out.println("자바 있어? "+ list.contains("Java"));
    	List<Object> temp = List.of(1, "Hello", "Java", 1);
    	System.out.println("몽창 같니? " +list.equals(temp)+", 같은 객체니?" +(list ==temp));
    	System.out.println("1번째 요소는? "+list.get(1));
    	System.out.println("Java는 몇 번째? "+list.indexOf("Java"));
    	System.out.println("Python는 몇 번째? "+list.indexOf("Python"));
    	System.out.println("전체 자료는 몇개? "+list.size());
    	System.out.println("배열로 바꿔봐? "+ Arrays.toString(list.toArray()));
    	
    	for(Object o: list) {
    		System.out.println(o);
    	}
        // END
    }

    public void updateTest() {
        // TODO: list의 요소를 수정하고 출력해보자.
    	System.out.println("수정 전: " +list);
    	list.set(1, "Nice");
    	System.out.println("수정 후: " +list);
        // END
    }

    public void deleteTest() {
        // TODO: list의 내용을 삭제해보자.
    	System.out.println("삭제 전: " +list);
    	list.remove(1);     // 객체 기반? index 기반 객체가 index랑 겹칠때 조심!!!
    	System.out.println("삭제 후 1: " +list);
    	list.remove("Java"); // 객체기반 삭제
    	System.out.println("삭제 후 2: " +list);
    	list.remove(Integer.valueOf(1));  // 객체를 지우려면 객체로 넣어줘야 한다.
    	System.out.println("삭제 후 3: " +list);
    	list.addAll(List.of(2, 3, 4, 5, 6));
    	System.out.println("삭제 후 4: " +list);
    	
    	// List.of는 변경 불가!! 그대로만 써야 함
    	List<Integer> ints =  new ArrayList<>(List.of(1, 2, 12, 4, 5, 6, 10, 8));
    	System.out.println(ints);
//    	for(int i=0; i<ints.size(); i++) {
//    		if(ints.get(i)%2==0) {
//    			ints.remove(i--);
//    		}
//    	}
    	
    	for(int i=ints.size()-1; i>=0; i--) {
    		if(ints.get(i)%2==0) {
    			ints.remove(i);
    		}
    	}
    	
    	System.out.println("짝수 삭제 후: " +ints);
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
