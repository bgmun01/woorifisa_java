package ch07.c_modifier.encapsulation;

class UnbelievableUserInfo {
	// 인캡슐레이션은 데이터의 은닉과 보호
    //이름은 null이 될 수 없음.
    private String name = "홍길동"; // 퍼블릭에서 프라이빗으로 변경
    // 계좌는 0보다 커야 함.
    private int account = 10000;
    
    public void setName(String name) {
    	if (name != null) {
    		this.name = name;
    	}else {
    		System.out.println("name은 null 일 수 없다");
    	}//이런게 인캡슐레이션?? 에러 해결
    	
	}
    
    public String getName( ) {
    	return this.name;
    }
    //세터와 게터
    public void setAccount(int account) {
    	if(account>0) {
    		this.account = account;
    	}else {
    		System.out.println("마통 멈춰 !!!");
    	}
    }
    public int getAccount() {
    	return this.account;
    }
    	
    	
		
	}


public class UnbelievableTest {
    public static void main(String[] args) {
        UnbelievableUserInfo info = new UnbelievableUserInfo();
        System.out.printf("사용자 정보:%s, %d%n", info.getName(), info.getAccount()); // 이거든 이제 안됨
//        info.name = null;
        info.setName(null);
//        info.account = -1000;
        info.setAccount(-1000);
        System.out.printf("사용자 정보:%s, %d%n", info.getName(), info.getAccount());
    }
}
